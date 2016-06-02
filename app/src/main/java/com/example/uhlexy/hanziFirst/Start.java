package com.example.uhlexy.hanziFirst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Start Activity
 *
 * @author Yincong
 */
public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Call Activity Learn
     *
     * @param v
     */
    public void onClickLearn(View v) {
        Intent intent = new Intent(this, Learn.class);
        startActivity(intent);

    }

    /**
     * Call Activity Speller
     *
     * @param v
     */
    public void onClickSpeller(View v) {
        Intent intent = new Intent(this, Speller.class);
        startActivity(intent);
    }

    /**
     * Call Activity Test
     *
     * @param v
     */
    public void onClickTest(View v) {
        Intent intent = new Intent(this, Test.class);
        startActivity(intent);
    }

    /**
     * Call Activity Memory
     *
     * @param v
     */
    public void onClickMemory(View v) {
        Intent intent = new Intent(this, Memory.class);
        startActivity(intent);
    }


}
