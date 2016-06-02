package com.example.uhlexy.hanziFirst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.uhlexy.hanziFirst.helper.DatabaseHelper;

import java.util.Locale;

/**
 * Help Activity
 *
 * @author Yincong
 */
public class Help extends AppCompatActivity {

    TextView tvPrompt, tvAnswer;
    /**
     * Database Helper
     */
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Bundle b = getIntent().getExtras();
        int number = b.getInt("number");
        tvPrompt = (TextView) findViewById(R.id.textView6);
        tvAnswer = (TextView) findViewById(R.id.textView4);
        //
        db = new DatabaseHelper(getApplicationContext());
        String idioma = Locale.getDefault().getDisplayLanguage();
        if (idioma.equals("English")) {
            tvPrompt.setText(db.getKeyPinyin(number) + ", Tones: " + db.getKeyTone(number) + " - " + db.getKeyWordInEnglish(number));
            tvAnswer.setText(db.getKeyCharacterHanzi(number));
        } else if (idioma.equals("español")) {
            tvPrompt.setText(db.getKeyPinyin(number) + db.getKeyTone(number) + " - " + db.getKeyWordInSpanish(number));
            tvAnswer.setText(db.getKeyCharacterHanzi(number));
        }

    }
}
