package com.example.uhlexy.hanziFirst;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uhlexy.hanziFirst.helper.DatabaseHelper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * Test Activity
 *
 * @author Yincong
 */
public class Test extends AppCompatActivity {

    public Random rand = new Random();

    /**
     * Database Helper
     */
    public DatabaseHelper db;
    /**
     * RANDOM NUMBER
     */
    int num, numRandomOption;
    List<Integer> listOptions;
    List<Integer> numbers;

    /**
     * Button
     */
    public Button button;
    private int qid;
    /**
     * Text View
     */
    public TextView tvTestQ1, tvTestQ2, tvTestQ3, tvTestQ4, tvQ1, tvQ2, tvQ3, tvQ4, tvTopTitle, tvQNumber;
    private List<TextView> listQuestion;
    /**
     * Radio Button Group
     */
    public RadioGroup grp;
    /**
     * Language
     */
    String language;
    /**
     * Music Player
     */
    public MediaPlayer mp;
    private int current;
    private boolean correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //
        language = Locale.getDefault().getDisplayLanguage();

        //
        db = new DatabaseHelper(getApplicationContext());

        //
        correct = false;

        listQuestion = new ArrayList<>();

        tvTopTitle = (TextView) findViewById(R.id.textView15);
        grp = (RadioGroup) findViewById(R.id.rGrupOption);
        tvQNumber = (TextView) findViewById(R.id.txtVQNumber);
        button = (Button) findViewById(R.id.btnHanzi);
        tvTestQ1 = (TextView) findViewById(R.id.txtVOptionAHanzi);
        listQuestion.add(tvTestQ1);
        tvTestQ2 = (TextView) findViewById(R.id.txtVOptionBHanzi);
        listQuestion.add(tvTestQ2);
        tvTestQ3 = (TextView) findViewById(R.id.txtVOptionCHanzi);
        listQuestion.add(tvTestQ3);
        tvTestQ4 = (TextView) findViewById(R.id.txtVOptionDHanzi);
        listQuestion.add(tvTestQ4);

        tvQ1 = (TextView) findViewById(R.id.textView2);
        tvQ2 = (TextView) findViewById(R.id.textView3);
        tvQ3 = (TextView) findViewById(R.id.textView4);
        tvQ4 = (TextView) findViewById(R.id.textView5);

        numbers = new ArrayList<Integer>();
        listOptions = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int i = 0; i < 4; i++) {
            listOptions.add(numbers.get(i));
        }

        numRandomOption = 1 + (int) (Math.random() * ((4 - 1) + 1));

        num = listOptions.get(numRandomOption - 1);

        current = 1;
        tvQNumber.setText(String.valueOf(current));
        String message = (String) button.getText();
        if (message.equals("Hanzi")) {
            if (language.equals("English")) {
                tvTopTitle.setText("            " + db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num) + " - " + db.getKeyWordInEnglish(num));
            } else if (language.equals("español")) {
                tvTopTitle.setText("            " + db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num) + " - " + db.getKeyWordInSpanish(num));
            }
            if (listOptions.size() == listQuestion.size()) {
                for (int i = 0; i < listOptions.size(); i++) {
                    if (numRandomOption == i) {
                        listQuestion.get(numRandomOption).setText(db.getKeyCharacterHanzi(listOptions.get(i)));
                    } else {
                        listQuestion.get(i).setText(db.getKeyCharacterHanzi(listOptions.get(i)));
                    }
                }
            }
        } else {
            if (language.equals("English")) {
                tvTopTitle.setText("            " + db.getKeyCharacterHanzi(num) + " - " + db.getKeyWordInEnglish(num));
            } else if (language.equals("español")) {
                tvTopTitle.setText("            " + db.getKeyCharacterHanzi(num) + " - " + db.getKeyWordInSpanish(num));
            }
            if (listOptions.size() == listQuestion.size()) {
                for (int i = 0; i < listOptions.size(); i++) {
                    if (numRandomOption == i) {
                        listQuestion.get(numRandomOption).setText(db.getKeyPinyin(listOptions.get(i)) + ", Tones: " + db.getKeyTone(listOptions.get(i)));
                    } else {
                        listQuestion.get(i).setText(db.getKeyPinyin(listOptions.get(i)) + ", Tones: " + db.getKeyTone(listOptions.get(i)));
                    }
                }
            }
        }
        //
        grp.clearCheck();
        //
        mp = new MediaPlayer();

    }

    /**
     * Click button Restart
     *
     * @param view
     */
    public void onClickRestart(View view) {
        numbers = new ArrayList<Integer>();
        listOptions = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int i = 0; i < 4; i++) {
            listOptions.add(numbers.get(i));
        }

        numRandomOption = 1 + (int) (Math.random() * ((4 - 1) + 1));

        num = listOptions.get(numRandomOption - 1);

        current = 1;
        tvQNumber.setText(String.valueOf(current));
        String message = (String) button.getText();
        if (message.equals("Hanzi")) {
            if (language.equals("English")) {
                tvTopTitle.setText("            " + db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num) + " - " + db.getKeyWordInEnglish(num));
            } else if (language.equals("español")) {
                tvTopTitle.setText("            " + db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num) + " - " + db.getKeyWordInSpanish(num));
            }
            if (listOptions.size() == listQuestion.size()) {
                for (int i = 0; i < listOptions.size(); i++) {
                    if (numRandomOption == i) {
                        listQuestion.get(numRandomOption).setText(db.getKeyCharacterHanzi(listOptions.get(i)));
                    } else {
                        listQuestion.get(i).setText(db.getKeyCharacterHanzi(listOptions.get(i)));
                    }
                }
            }
        } else {
            if (language.equals("English")) {
                tvTopTitle.setText("            " + db.getKeyCharacterHanzi(num) + " - " + db.getKeyWordInEnglish(num));
            } else if (language.equals("español")) {
                tvTopTitle.setText("            " + db.getKeyCharacterHanzi(num) + " - " + db.getKeyWordInSpanish(num));
            }
            if (listOptions.size() == listQuestion.size()) {
                for (int i = 0; i < listOptions.size(); i++) {
                    if (numRandomOption == i) {
                        listQuestion.get(numRandomOption).setText(db.getKeyPinyin(listOptions.get(i)) + ", Tones: " + db.getKeyTone(listOptions.get(i)));
                    } else {
                        listQuestion.get(i).setText(db.getKeyPinyin(listOptions.get(i)) + ", Tones: " + db.getKeyTone(listOptions.get(i)));
                    }
                }
            }
        }
        grp.clearCheck();
    }

    /**
     * Click button Hanzi
     *
     * @param view
     */
    public void onClickHanzi(View view) {
        String message = (String) button.getText();
        if (message.equals("Hanzi")) {
            if (language.equals("English")) {
                tvTopTitle.setText("            " + db.getKeyCharacterHanzi(num) + " - " + db.getKeyWordInEnglish(num));
            } else if (language.equals("español")) {
                tvTopTitle.setText("            " + db.getKeyCharacterHanzi(num) + " - " + db.getKeyWordInSpanish(num));
            }
            if (listOptions.size() == listQuestion.size()) {
                for (int i = 0; i < listOptions.size(); i++) {
                    if (numRandomOption == i) {
                        listQuestion.get(numRandomOption).setText(db.getKeyPinyin(listOptions.get(i)) + ", Tones: " + db.getKeyTone(listOptions.get(i)));
                    } else {
                        listQuestion.get(i).setText(db.getKeyPinyin(listOptions.get(i)) + ", Tones: " + db.getKeyTone(listOptions.get(i)));
                    }
                }
            }
            button.setText("Pinyin");
        } else {
            if (language.equals("English")) {
                tvTopTitle.setText("            " + db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num) + " - " + db.getKeyWordInEnglish(num));
            } else if (language.equals("español")) {
                tvTopTitle.setText("            " + db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num) + " - " + db.getKeyWordInSpanish(num));
            }
            if (listOptions.size() == listQuestion.size()) {
                for (int i = 0; i < listOptions.size(); i++) {
                    if (numRandomOption == i) {
                        listQuestion.get(numRandomOption).setText(db.getKeyCharacterHanzi(listOptions.get(i)));
                    } else {
                        listQuestion.get(i).setText(db.getKeyCharacterHanzi(listOptions.get(i)));
                    }
                }
            }
            button.setText("Hanzi");
        }
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

    /**
     * Click button Sound1
     *
     * @param view
     */
    public void onClickSound1(View view) {
        int id = searchSoundID(listOptions.get(0));
        mp = MediaPlayer.create(this, id);
        mp.start();
    }

    /**
     * Click button Sound2
     *
     * @param view
     */
    public void onClickSound2(View view) {
        int id = searchSoundID(listOptions.get(1));
        mp = MediaPlayer.create(this, id);
        mp.start();
    }

    /**
     * Click button Sound3
     *
     * @param view
     */
    public void onClickSound3(View view) {
        int id = searchSoundID(listOptions.get(2));
        mp = MediaPlayer.create(this, id);
        mp.start();
    }

    /**
     * Click button Sound4
     *
     * @param view
     */
    public void onClickSound4(View view) {
        int id = searchSoundID(listOptions.get(3));
        mp = MediaPlayer.create(this, id);
        mp.start();
    }

    public void onClickNext(View view) {
        correct = false;

        String message = (String) button.getText();
        int opCorrect = 0;
        for (int i = 0; i < listOptions.size(); i++) {
            if (num == listOptions.get(i)) {
                opCorrect = i;
                break;
            }
        }

        Log.d("num", "onClickNext: " + opCorrect);
        // Check which radio button was clicked
        switch (grp.getCheckedRadioButtonId()) {
            case R.id.radioButton:
                if (message.equals("Hanzi")) {
                    if (listQuestion.get(0).getText().equals(db.getKeyCharacterHanzi(num))) {
                        Toast.makeText(this.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        correct = true;
                    } else {
                        Toast.makeText(this.getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                        switch (opCorrect) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ1.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 1:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ2.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ3.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ4.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                        }
                        ((RadioButton) grp.getChildAt(opCorrect)).setChecked(true);
                    }
                } else {
                    if (listQuestion.get(0).getText().equals(db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num))) {
                        Toast.makeText(this.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        correct = true;
                    } else {
                        Toast.makeText(this.getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                        switch (opCorrect) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ1.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 1:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ2.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ3.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ4.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                        }
                        ((RadioButton) grp.getChildAt(opCorrect)).setChecked(true);
                    }
                }
                break;
            case R.id.radioButton2:
                if (message.equals("Hanzi")) {
                    if (listQuestion.get(1).getText().equals(db.getKeyCharacterHanzi(num))) {
                        Toast.makeText(this.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        correct = true;
                    } else {
                        Toast.makeText(this.getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                        switch (opCorrect) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ1.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 1:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ2.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ3.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ4.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                        }
                        ((RadioButton) grp.getChildAt(opCorrect)).setChecked(true);
                    }
                } else {
                    if (listQuestion.get(1).getText().equals(db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num))) {
                        Toast.makeText(this.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        correct = true;
                    } else {
                        Toast.makeText(this.getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                        switch (opCorrect) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ1.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 1:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ2.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ3.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ4.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                        }
                        ((RadioButton) grp.getChildAt(opCorrect)).setChecked(true);
                    }
                }
                break;
            case R.id.radioButton3:
                if (message.equals("Hanzi")) {
                    if (listQuestion.get(2).getText().equals(db.getKeyCharacterHanzi(num))) {
                        Toast.makeText(this.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        correct = true;
                    } else {
                        Toast.makeText(this.getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                        switch (opCorrect) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ1.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 1:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ2.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ3.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ4.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                        }
                        ((RadioButton) grp.getChildAt(opCorrect)).setChecked(true);
                    }
                } else {
                    if (listQuestion.get(2).getText().equals(db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num))) {
                        Toast.makeText(this.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        correct = true;
                    } else {
                        Toast.makeText(this.getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                        switch (opCorrect) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ1.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 1:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ2.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ3.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ4.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                        }
                        ((RadioButton) grp.getChildAt(opCorrect)).setChecked(true);
                    }
                }
                break;
            case R.id.radioButton4:
                if (message.equals("Hanzi")) {
                    if (listQuestion.get(3).getText().equals(db.getKeyCharacterHanzi(num))) {
                        Toast.makeText(this.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        correct = true;
                    } else {
                        Toast.makeText(this.getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                        switch (opCorrect) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ1.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 1:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ2.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ3.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ4.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                        }
                        ((RadioButton) grp.getChildAt(opCorrect)).setChecked(true);
                    }
                } else {
                    if (listQuestion.get(3).getText().equals(db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num))) {
                        Toast.makeText(this.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        correct = true;
                    } else {
                        Toast.makeText(this.getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                        switch (opCorrect) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ1.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 1:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ2.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ3.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_darkgreen));
                                } else {
                                    tvQ4.setBackgroundResource(R.drawable.custom_layout_test_darkgreen);
                                }
                                break;
                        }
                        ((RadioButton) grp.getChildAt(opCorrect)).setChecked(true);
                    }
                }
                break;
            default:
                Toast.makeText(this.getApplicationContext(), "You should choose one option!", Toast.LENGTH_SHORT).show();
        }

        if (correct) {
            numbers = new ArrayList<Integer>();
            listOptions = new ArrayList<Integer>();
            for (int i = 1; i <= 50; i++) {
                numbers.add(i);
            }

            Collections.shuffle(numbers);

            for (int i = 0; i < 4; i++) {
                listOptions.add(numbers.get(i));
            }

            numRandomOption = 1 + (int) (Math.random() * ((4 - 1) + 1));

            num = listOptions.get(numRandomOption - 1);

            current++;
            tvQNumber.setText(String.valueOf(current));
            if (message.equals("Hanzi")) {
                if (language.equals("English")) {
                    tvTopTitle.setText("            " + db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num) + " - " + db.getKeyWordInEnglish(num));
                } else if (language.equals("español")) {
                    tvTopTitle.setText("            " + db.getKeyPinyin(num) + ", Tones: " + db.getKeyTone(num) + " - " + db.getKeyWordInSpanish(num));
                }
                if (listOptions.size() == listQuestion.size()) {
                    for (int i = 0; i < listOptions.size(); i++) {
                        if (numRandomOption == i) {
                            listQuestion.get(numRandomOption).setText(db.getKeyCharacterHanzi(listOptions.get(i)));
                        } else {
                            listQuestion.get(i).setText(db.getKeyCharacterHanzi(listOptions.get(i)));
                        }
                    }
                }
            } else {
                if (language.equals("English")) {
                    tvTopTitle.setText("            " + db.getKeyCharacterHanzi(num) + " - " + db.getKeyWordInEnglish(num));
                } else if (language.equals("español")) {
                    tvTopTitle.setText("            " + db.getKeyCharacterHanzi(num) + " - " + db.getKeyWordInSpanish(num));
                }
                if (listOptions.size() == listQuestion.size()) {
                    for (int i = 0; i < listOptions.size(); i++) {
                        if (numRandomOption == i) {
                            listQuestion.get(numRandomOption).setText(db.getKeyPinyin(listOptions.get(i)) + ", Tones: " + db.getKeyTone(listOptions.get(i)));
                        } else {
                            listQuestion.get(i).setText(db.getKeyPinyin(listOptions.get(i)) + ", Tones: " + db.getKeyTone(listOptions.get(i)));
                        }
                    }
                }
            }
            grp.clearCheck();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                tvQ1.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_green));
                tvQ2.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_green));
                tvQ3.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_green));
                tvQ4.setBackground(getResources().getDrawable(R.drawable.custom_layout_test_green));
            } else {
                tvQ1.setBackgroundResource(R.drawable.custom_layout_test_green);
                tvQ2.setBackgroundResource(R.drawable.custom_layout_test_green);
                tvQ3.setBackgroundResource(R.drawable.custom_layout_test_green);
                tvQ4.setBackgroundResource(R.drawable.custom_layout_test_green);
            }
        }
    }
}
