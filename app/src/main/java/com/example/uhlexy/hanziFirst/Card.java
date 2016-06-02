package com.example.uhlexy.hanziFirst;

import android.widget.Button;
import android.widget.ImageButton;

/**
 * Class Card for Memory Game
 *
 * @author Yincong
 */
public class Card {

    public int x;
    public int y;
    public Button button;

    /**
     * Constructor
     */
    public Card(Button button, int x, int y) {
        this.x = x;
        this.y = y;
        this.button = button;
    }


}
