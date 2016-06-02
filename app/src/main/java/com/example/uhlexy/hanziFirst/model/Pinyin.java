package com.example.uhlexy.hanziFirst.model;

/**
 * Model Pinyin
 * Created by Yincong on 28/04/2016.
 */
public class Pinyin {

    int pinyin_id;
    String pinyin;
    int tone;
    int sound_id;

    /**
     * Constructor
     */
    public Pinyin() {
    }

    /**
     * Constructor
     */
    public Pinyin(String pinyin, int tone, int sound_id) {
        this.pinyin = pinyin;
        this.tone = tone;
        this.sound_id = sound_id;
    }

    public int getPinyin_id() {
        return pinyin_id;
    }

    public void setPinyin_id(int pinyin_id) {
        this.pinyin_id = pinyin_id;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public int getTone() {
        return tone;
    }

    public void setTone(int tone) {
        this.tone = tone;
    }

    public int getSound_id() {
        return sound_id;
    }

    public void setSound_id(int sound_id) {
        this.sound_id = sound_id;
    }

    @Override
    public String toString() {
        return "Pinyin{" +
                "pinyin_id=" + pinyin_id +
                ", pinyin='" + pinyin + '\'' +
                ", tone=" + tone +
                ", sound_id=" + sound_id +
                '}';
    }
}
