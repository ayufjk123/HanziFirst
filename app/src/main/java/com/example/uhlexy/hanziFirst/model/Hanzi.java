package com.example.uhlexy.hanziFirst.model;

/**
 * Model Hanzi
 * Created by Yincong on 28/04/2016.
 */
public class Hanzi {

    int hanzi_id;
    String characterHanzi;

    /**
     * Constructor
     */
    public Hanzi() {
    }

    /**
     * Constructor
     */
    public Hanzi(String characterHanzi) {
        this.characterHanzi = characterHanzi;
    }

    /**
     * Constructor
     */
    public Hanzi(int hanzi_id, String characterHanzi) {
        this.hanzi_id = hanzi_id;
        this.characterHanzi = characterHanzi;
    }

    public int getHanzi_id() {
        return hanzi_id;
    }

    public void setHanzi_id(int hanzi_id) {
        this.hanzi_id = hanzi_id;
    }

    public String getCharacterHanzi() {
        return characterHanzi;
    }

    public void setCharacterHanzi(String characterHanzi) {
        this.characterHanzi = characterHanzi;
    }

    @Override
    public String toString() {
        return "Hanzi{" +
                "hanzi_id=" + hanzi_id +
                ", characterHanzi='" + characterHanzi + '\'' +
                '}';
    }
}
