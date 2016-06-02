package com.example.uhlexy.hanziFirst;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.uhlexy.hanziFirst.helper.DatabaseHelper;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Random;

/**
 * Activity Learn
 *
 * @author Yincong
 */
public class Learn extends AppCompatActivity {

    public Random rand = new Random();
    // Database Helper
    public DatabaseHelper db;
    // number random
    public int n, correct, incorrect, total;
    // Text View
    public TextView tv, tv2, tvTotal, tvcorrect, tvincorrect, tvTopTitle, tvTopPinyinTitle;
    // Button
    public Button button;
    // Music Player & Sound Pool
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        //
        correct = 0;
        incorrect = 0;
        total = 50;
        /**
         * Number Random
         * */
        n = rand.nextInt(50) + 1;
        //
        db = new DatabaseHelper(getApplicationContext());
        //
        tv = (TextView) findViewById(R.id.txtVTopPinyin);
        tv.setText(db.getKeyPinyin(n) + ", Tones: " + db.getKeyTone(n));
        //
        tvTopTitle = (TextView) findViewById(R.id.txtVTopEngTitle);
        //
        String idioma = Locale.getDefault().getDisplayLanguage();
        tv2 = (TextView) findViewById(R.id.txtVTopEng);
        if (idioma.equals("English")) {
            tvTopTitle.setText("  ENG:");
            tv2.setText(db.getKeyWordInEnglish(n));
        } else if (idioma.equals("español")) {
            tvTopTitle.setText("  ESP:");
            tv2.setText(db.getKeyWordInSpanish(n));
        }
        //
        tvTotal = (TextView) findViewById(R.id.txtVTotal);
        tvTotal.setText(String.valueOf(total));
        tvcorrect = (TextView) findViewById(R.id.txtVCorrect);
        tvincorrect = (TextView) findViewById(R.id.txtVIncorrect);
        //
        tvTopPinyinTitle = (TextView) findViewById(R.id.txtVTopPinyinTitle);
        button = (Button) findViewById(R.id.btnHanzi);
        //
        mp = new MediaPlayer();
    }

    /**
     * Search ID of sound file
     *
     * @param num
     * @return id
     */
    private int searchSoundID(int num) {
        Field[] fields = R.raw.class.getFields();
        for (int count = 0; count < fields.length; count++) {
            Log.i("Raw Asset: ", fields[count].getName());
            if (fields[count].getName().endsWith(String.valueOf(num))) {
                return getResources().getIdentifier(fields[count].getName(),
                        "raw", getPackageName());
            }
        }
        return 0;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mp != null) {
            mp.release();
        }
    }

    /**
     * Click button Help
     *
     * @param view
     */
    public void onClickHelp(View view) {
        Intent i = new Intent(this, Help.class);
        i.putExtra("number", n);
        startActivity(i);
    }

    /**
     * Click button Hanzi
     *
     * @param view
     */
    public void onClickHanzi(View view) {
        String message = (String) button.getText();
        if (message.equals("Hanzi")) {
            tvTopPinyinTitle.setText("  HAZ:");
            tv.setText(db.getKeyCharacterHanzi(n));
            button.setText("Pinyin");
        } else {
            tvTopPinyinTitle.setText("  PYN:");
            tv.setText(db.getKeyPinyin(n) + ", Tones: " + db.getKeyTone(n));
            button.setText("Hanzi");
        }
    }

    /**
     * Click button Sound
     *
     * @param view
     */
    public void onClickSound(View view) {
        String name_Sound = db.getKeyUrlSound(n);
        int id = searchSoundID(n);
        mp = MediaPlayer.create(this, id);
        mp.start();
    }

    /**
     * Click button Restart
     *
     * @param view
     */
    public void onClickRestart(View view) {
        n = rand.nextInt(50) + 1;
        String message = (String) button.getText();
        if (message.equals("Hanzi")) {
            tvTopPinyinTitle.setText("  PYN:");
            tv.setText(db.getKeyPinyin(n) + ", Tones: " + db.getKeyTone(n));
        } else {
            tvTopPinyinTitle.setText("  HAZ:");
            tv.setText(db.getKeyCharacterHanzi(n));
        }
        String idioma = Locale.getDefault().getDisplayLanguage();
        if (idioma.equals("English")) {
            tvTopTitle.setText("  ENG:");
            tv2.setText(db.getKeyWordInEnglish(n));
        } else if (idioma.equals("español")) {
            tvTopTitle.setText("  ESP:");
            tv2.setText(db.getKeyWordInSpanish(n));
        }
        total = 50;
        correct = 0;
        incorrect = 0;
        tvTotal.setText(String.valueOf(total));
        tvcorrect.setText(String.valueOf(correct));
        tvincorrect.setText(String.valueOf(incorrect));
    }

    /**
     * Click button Answer
     *
     * @param view
     */
    public void onClickAnswer(View view) {
        String message = (String) button.getText();
        EditText editText = (EditText) findViewById(R.id.editText);
        String answer_user = editText.getText().toString();
        total--;
        if (message.equals("Hanzi")) {
            String answer_db = db.getKeyCharacterHanzi(n);
            if (answer_db.equals(answer_user)) {
                correct++;
                tvcorrect.setText(String.valueOf(correct));
            } else {
                incorrect++;
                tvincorrect.setText(String.valueOf(incorrect));
            }
        } else {
            String answer_db = db.getPinyin(n) + db.getKeyTone(n);
            if (answer_db.equals(answer_user)) {
                correct++;
                tvcorrect.setText(String.valueOf(correct));
            } else {
                incorrect++;
                tvincorrect.setText(String.valueOf(incorrect));
            }
        }
        tvTotal.setText(String.valueOf(total));
        n = rand.nextInt(50) + 1;
        if (message.equals("Hanzi")) {
            tvTopPinyinTitle.setText("  PYN:");
            tv.setText(db.getKeyPinyin(n) + ", Tones: " + db.getKeyTone(n));
        } else {
            tvTopPinyinTitle.setText("  HAZ:");
            tv.setText(db.getKeyCharacterHanzi(n));
        }
        String idioma = Locale.getDefault().getDisplayLanguage();
        if (idioma.equals("English")) {
            tvTopTitle.setText("  ENG:");
            tv2.setText(db.getKeyWordInEnglish(n));
        } else if (idioma.equals("español")) {
            tvTopTitle.setText("  ESP:");
            tv2.setText(db.getKeyWordInSpanish(n));
        }
        editText.setText("");
    }

}
