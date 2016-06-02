package com.example.uhlexy.hanziFirst.model;

/**
 * Model Sound
 * Created by Yincong on 28/04/2016.
 */
public class Sound {

    int sound_id;
    String url_sound;
    int pinyin_id;

    /**
     * Constructor
     */
    public Sound() {
    }

    /**
     * Constructor
     */
    public Sound(String url_sound, int pinyin_id) {
        this.url_sound = url_sound;
        this.pinyin_id = pinyin_id;
    }

    public int getSound_id() {
        return sound_id;
    }

    public void setSound_id(int sound_id) {
        this.sound_id = sound_id;
    }

    public String getUrl_sound() {
        return url_sound;
    }

    public void setUrl_sound(String url_sound) {
        this.url_sound = url_sound;
    }

    public int getPinyin_id() {
        return pinyin_id;
    }

    public void setPinyin_id(int pinyin_id) {
        this.pinyin_id = pinyin_id;
    }

    @Override
    public String toString() {
        return "Sound{" +
                "sound_id=" + sound_id +
                ", url_sound='" + url_sound + '\'' +
                ", pinyin_id=" + pinyin_id +
                '}';
    }
}
