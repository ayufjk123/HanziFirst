package com.example.uhlexy.hanziFirst;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.uhlexy.hanziFirst.helper.DatabaseHelper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Activity Memory Game
 *
 * @author Yincong
 */
public class Memory extends AppCompatActivity {

    private static int ROW_COUNT = -1;
    private static int COL_COUNT = -1;
    private Context context;
    private Drawable backImage;
    private int[][] cards;
    private List<Integer> images;
    private Card firstCard;
    private Card seconedCard;
    private ButtonListener buttonListener;

    private static Object lock = new Object();

    int turns;
    private LinearLayout mainTable;
    private UpdateCardsHandler handler;
    /**
     * Database Helper
     */
    public DatabaseHelper db;

    private Button[][] buttons;

    private Button button;
    private int score;
    private long startTime;
    private Handler customHandler = new Handler();
    long timeInMilliseconds = 0L;
    long timeSwapBuff = 0L;
    long updatedTime = 0L;
    private boolean start = false, pause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        handler = new UpdateCardsHandler();
        loadImages();

        backImage = getResources().getDrawable(R.drawable.logo3);

        buttonListener = new ButtonListener();

        mainTable = (LinearLayout) findViewById(R.id.lineaLayout);

        context = mainTable.getContext();

        //
        db = new DatabaseHelper(getApplicationContext());

        button = (Button) findViewById(R.id.button3);
        button.setText(0 + "");

        ImageButton pauseButton = (ImageButton) findViewById(R.id.imageButton29);

        pauseButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                if (!pause) {
                    startTime = SystemClock.uptimeMillis();
                    customHandler.removeCallbacks(updateTimerThread);
                    pause = true;
                } else {
                    timeSwapBuff += timeInMilliseconds;
                    customHandler.postDelayed(updateTimerThread, 0);
                    pause = false;
                }

            }

        });

        if (!pause) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                pauseButton.setBackgroundResource(R.drawable.play);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    pauseButton.setBackgroundTintMode(PorterDuff.Mode.DARKEN);
                }
            }
            pause = true;
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                pauseButton.setBackgroundResource(R.drawable.pause);
            }
            pause = false;
        }

        newGame(4, 4);

    }

    /**
     * New game
     *
     * @param c
     * @param r
     */
    private void newGame(int c, int r) {
        ROW_COUNT = r;
        COL_COUNT = c;

        cards = new int[COL_COUNT][ROW_COUNT];
        buttons = new Button[COL_COUNT][ROW_COUNT];

        for (int y = 0; y < ROW_COUNT; y++) {
            for (int x = 0; x < COL_COUNT; x++) {
                String buttonID = "imageButton" + y + "_" + x;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[x][y] = ((Button) findViewById(resID));
                buttons[x][y].setBackgroundDrawable(backImage);
                buttons[x][y].setOnClickListener(buttonListener);
                buttons[x][y].setId(100 * x + y);
            }
        }

        firstCard = null;
        loadCards();

        turns = 0;
        ((TextView) findViewById(R.id.button2)).setText("Time: " + turns);

    }

    /**
     * Load Image
     */
    private void loadImages() {

        images = new ArrayList<Integer>();

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int i = 0; i < 15; i++) {
            images.add(numbers.get(i));
        }

    }

    /**
     * Load cards
     */
    private void loadCards() {
        try {
            int size = ROW_COUNT * COL_COUNT;

            Log.i("loadCards()", "size=" + size);

            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < size; i++) {
                list.add(new Integer(i));
            }


            Random r = new Random();

            for (int i = 0; i < size; i++) {
                int t = 0;

                if (i > 0) {
                    t = r.nextInt(i);
                }

                t = list.remove(t).intValue();
                cards[i % COL_COUNT][i / COL_COUNT] = t % (size / 2);

                Log.i("loadCards()", "card[" + (i % COL_COUNT) +
                        "][" + (i / COL_COUNT) + "]=" + cards[i % COL_COUNT][i / COL_COUNT]);
            }
        } catch (Exception e) {
            Log.e("loadCards()", e + "");
        }

    }

    class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            synchronized (lock) {
                if (firstCard != null && seconedCard != null) {
                    return;
                }
                int id = v.getId();
                int x = id / 100;
                int y = id % 100;
                turnCard((Button) v, x, y);
                if (!start) {
                    startTime = SystemClock.uptimeMillis();
                    start = true;
                }
                customHandler.postDelayed(updateTimerThread, 0);
            }

        }

        /**
         * Trun card
         *
         * @param button
         * @param x
         * @param y
         */
        private void turnCard(Button button, int x, int y) {
            button.setBackgroundResource(0);
            button.setText(db.getKeyCharacterHanzi(images.get(cards[x][y])));

            if (firstCard == null) {
                firstCard = new Card(button, x, y);
            } else {

                if (firstCard.x == x && firstCard.y == y) {
                    return; //the user pressed the same card
                }

                seconedCard = new Card(button, x, y);

                turns++;


                TimerTask tt = new TimerTask() {

                    @Override
                    public void run() {
                        try {
                            synchronized (lock) {
                                handler.sendEmptyMessage(0);
                            }
                        } catch (Exception e) {
                            Log.e("E1", e.getMessage());
                        }
                    }
                };

                Timer t = new Timer(false);
                t.schedule(tt, 1300);
            }


        }

    }

    class UpdateCardsHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            synchronized (lock) {
                checkCards(msg);
            }
        }

        public void checkCards(Message msg) {
            if (cards[seconedCard.x][seconedCard.y] == cards[firstCard.x][firstCard.y]) {
                score += 10;
                firstCard.button.setVisibility(View.INVISIBLE);
                seconedCard.button.setVisibility(View.INVISIBLE);
                button.setText(score + "");
            } else {
                seconedCard.button.setBackgroundDrawable(backImage);
                seconedCard.button.setText("");
                firstCard.button.setBackgroundDrawable(backImage);
                firstCard.button.setText("");
            }
            long currentTime = System.currentTimeMillis() - startTime;
            SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
            ((Button) findViewById(R.id.button2)).setText(sdf.format(currentTime));

            firstCard = null;
            seconedCard = null;
        }
    }

    private Runnable updateTimerThread = new Runnable() {

        public void run() {

            timeInMilliseconds = SystemClock.uptimeMillis() - startTime;

            updatedTime = timeSwapBuff + timeInMilliseconds;

            int secs = (int) (updatedTime / 1000);

            int mins = secs / 60;

            secs = secs % 60;

            int milliseconds = (int) (updatedTime % 1000);

            ((Button) findViewById(R.id.button2)).setText("" + mins + ":"

                    + String.format("%02d", secs));

            customHandler.postDelayed(this, 0);

        }
    };

}
