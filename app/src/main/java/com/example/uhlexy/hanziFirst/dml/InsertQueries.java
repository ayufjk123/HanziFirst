package com.example.uhlexy.hanziFirst.dml;

import com.example.uhlexy.hanziFirst.data.Characteres;
import com.example.uhlexy.hanziFirst.data.UrlSound;
import com.example.uhlexy.hanziFirst.data.Pinyins;
import com.example.uhlexy.hanziFirst.data.Tone;
import com.example.uhlexy.hanziFirst.data.WordInEnglish;
import com.example.uhlexy.hanziFirst.data.WordInSpanish;

/**
 * Query od SQLite
 * Created by Yincong on 10/05/2016.
 */
public class InsertQueries {

    /**
     * Table Names
     * */
    private static final String TABLE_HANZI = "hanzi";
    private static final String TABLE_PINYIN = "pinyin";
    private static final String TABLE_HANZI_PINYIN = "hanzi_pinyin";
    private static final String TABLE_SOUND = "sound";

    /**
     * Part Hanzi
     * */
    public static final String insertHanzi1 = "INSERT INTO " + TABLE_HANZI + " VALUES (1, '" + Characteres.hanzi1 + "');";
    public static final String insertHanzi2 = "INSERT INTO " + TABLE_HANZI + " VALUES (2, '" + Characteres.hanzi2 + "');";
    public static final String insertHanzi3 = "INSERT INTO " + TABLE_HANZI + " VALUES (3, '" + Characteres.hanzi3 + "');";
    public static final String insertHanzi4 = "INSERT INTO " + TABLE_HANZI + " VALUES (4, '" + Characteres.hanzi4 + "');";
    public static final String insertHanzi5 = "INSERT INTO " + TABLE_HANZI + " VALUES (5, '" + Characteres.hanzi5 + "');";
    public static final String insertHanzi6 = "INSERT INTO " + TABLE_HANZI + " VALUES (6, '" + Characteres.hanzi6 + "');";
    public static final String insertHanzi7 = "INSERT INTO " + TABLE_HANZI + " VALUES (7, '" + Characteres.hanzi7 + "');";
    public static final String insertHanzi8 = "INSERT INTO " + TABLE_HANZI + " VALUES (8, '" + Characteres.hanzi8 + "');";
    public static final String insertHanzi9 = "INSERT INTO " + TABLE_HANZI + " VALUES (9, '" + Characteres.hanzi9 + "');";
    public static final String insertHanzi10 = "INSERT INTO " + TABLE_HANZI + " VALUES (10, '" + Characteres.hanzi10 + "');";
    public static final String insertHanzi11 = "INSERT INTO " + TABLE_HANZI + " VALUES (11, '" + Characteres.hanzi11 + "');";
    public static final String insertHanzi12 = "INSERT INTO " + TABLE_HANZI + " VALUES (12, '" + Characteres.hanzi12 + "');";
    public static final String insertHanzi13 = "INSERT INTO " + TABLE_HANZI + " VALUES (13, '" + Characteres.hanzi13 + "');";
    public static final String insertHanzi14 = "INSERT INTO " + TABLE_HANZI + " VALUES (14, '" + Characteres.hanzi14 + "');";
    public static final String insertHanzi15 = "INSERT INTO " + TABLE_HANZI + " VALUES (15, '" + Characteres.hanzi15 + "');";
    public static final String insertHanzi16 = "INSERT INTO " + TABLE_HANZI + " VALUES (16, '" + Characteres.hanzi16 + "');";
    public static final String insertHanzi17 = "INSERT INTO " + TABLE_HANZI + " VALUES (17, '" + Characteres.hanzi17 + "');";
    public static final String insertHanzi18 = "INSERT INTO " + TABLE_HANZI + " VALUES (18, '" + Characteres.hanzi18 + "');";
    public static final String insertHanzi19 = "INSERT INTO " + TABLE_HANZI + " VALUES (19, '" + Characteres.hanzi19 + "');";
    public static final String insertHanzi20 = "INSERT INTO " + TABLE_HANZI + " VALUES (20, '" + Characteres.hanzi20 + "');";
    public static final String insertHanzi21 = "INSERT INTO " + TABLE_HANZI + " VALUES (21, '" + Characteres.hanzi21 + "');";
    public static final String insertHanzi22 = "INSERT INTO " + TABLE_HANZI + " VALUES (22, '" + Characteres.hanzi22 + "');";
    public static final String insertHanzi23 = "INSERT INTO " + TABLE_HANZI + " VALUES (23, '" + Characteres.hanzi23 + "');";
    public static final String insertHanzi24 = "INSERT INTO " + TABLE_HANZI + " VALUES (24, '" + Characteres.hanzi24 + "');";
    public static final String insertHanzi25 = "INSERT INTO " + TABLE_HANZI + " VALUES (25, '" + Characteres.hanzi25 + "');";
    public static final String insertHanzi26 = "INSERT INTO " + TABLE_HANZI + " VALUES (26, '" + Characteres.hanzi26 + "');";
    public static final String insertHanzi27 = "INSERT INTO " + TABLE_HANZI + " VALUES (27, '" + Characteres.hanzi27 + "');";
    public static final String insertHanzi28 = "INSERT INTO " + TABLE_HANZI + " VALUES (28, '" + Characteres.hanzi28 + "');";
    public static final String insertHanzi29 = "INSERT INTO " + TABLE_HANZI + " VALUES (29, '" + Characteres.hanzi29 + "');";
    public static final String insertHanzi30 = "INSERT INTO " + TABLE_HANZI + " VALUES (30, '" + Characteres.hanzi30 + "');";
    public static final String insertHanzi31 = "INSERT INTO " + TABLE_HANZI + " VALUES (31, '" + Characteres.hanzi31 + "');";
    public static final String insertHanzi32 = "INSERT INTO " + TABLE_HANZI + " VALUES (32, '" + Characteres.hanzi32 + "');";
    public static final String insertHanzi33 = "INSERT INTO " + TABLE_HANZI + " VALUES (33, '" + Characteres.hanzi33 + "');";
    public static final String insertHanzi34 = "INSERT INTO " + TABLE_HANZI + " VALUES (34, '" + Characteres.hanzi34 + "');";
    public static final String insertHanzi35 = "INSERT INTO " + TABLE_HANZI + " VALUES (35, '" + Characteres.hanzi35 + "');";
    public static final String insertHanzi36 = "INSERT INTO " + TABLE_HANZI + " VALUES (36, '" + Characteres.hanzi36 + "');";
    public static final String insertHanzi37 = "INSERT INTO " + TABLE_HANZI + " VALUES (37, '" + Characteres.hanzi37 + "');";
    public static final String insertHanzi38 = "INSERT INTO " + TABLE_HANZI + " VALUES (38, '" + Characteres.hanzi38 + "');";
    public static final String insertHanzi39 = "INSERT INTO " + TABLE_HANZI + " VALUES (39, '" + Characteres.hanzi39 + "');";
    public static final String insertHanzi40 = "INSERT INTO " + TABLE_HANZI + " VALUES (40, '" + Characteres.hanzi40 + "');";
    public static final String insertHanzi41 = "INSERT INTO " + TABLE_HANZI + " VALUES (41, '" + Characteres.hanzi41 + "');";
    public static final String insertHanzi42 = "INSERT INTO " + TABLE_HANZI + " VALUES (42, '" + Characteres.hanzi42 + "');";
    public static final String insertHanzi43 = "INSERT INTO " + TABLE_HANZI + " VALUES (43, '" + Characteres.hanzi43 + "');";
    public static final String insertHanzi44 = "INSERT INTO " + TABLE_HANZI + " VALUES (44, '" + Characteres.hanzi44 + "');";
    public static final String insertHanzi45 = "INSERT INTO " + TABLE_HANZI + " VALUES (45, '" + Characteres.hanzi45 + "');";
    public static final String insertHanzi46 = "INSERT INTO " + TABLE_HANZI + " VALUES (46, '" + Characteres.hanzi46 + "');";
    public static final String insertHanzi47 = "INSERT INTO " + TABLE_HANZI + " VALUES (47, '" + Characteres.hanzi47 + "');";
    public static final String insertHanzi48 = "INSERT INTO " + TABLE_HANZI + " VALUES (48, '" + Characteres.hanzi48 + "');";
    public static final String insertHanzi49 = "INSERT INTO " + TABLE_HANZI + " VALUES (49, '" + Characteres.hanzi49 + "');";
    public static final String insertHanzi50 = "INSERT INTO " + TABLE_HANZI + " VALUES (50, '" + Characteres.hanzi50 + "');";

    /**
     * Part Pinyin
     * */
    public static final String insertPinyin1 = "INSERT INTO " + TABLE_PINYIN + " VALUES (1, '" + Pinyins.pinyin1 + "', '" + Tone.tone4 + "', '" + 1 + "');";
    public static final String insertPinyin2 = "INSERT INTO " + TABLE_PINYIN + " VALUES (2, '" + Pinyins.pinyin1 + "', '" + Tone.tone3 + "', '" + 2 + "');";
    public static final String insertPinyin3 = "INSERT INTO " + TABLE_PINYIN + " VALUES (3, '" + Pinyins.pinyin2 + "', '" + Tone.tone4 + "', '" + 3 + "');";
    public static final String insertPinyin4 = "INSERT INTO " + TABLE_PINYIN + " VALUES (4, '" + Pinyins.pinyin3 + "', '" + Tone.tone4 + "', '" + 4 + "');";
    public static final String insertPinyin5 = "INSERT INTO " + TABLE_PINYIN + " VALUES (5, '" + Pinyins.pinyin4 + "', '" + Tone.tone4 + "', '" + 5 + "');";
    public static final String insertPinyin6 = "INSERT INTO " + TABLE_PINYIN + " VALUES (6, '" + Pinyins.pinyin5 + "', '" + Tone.tone1 + "', '" + 6 + "');";
    public static final String insertPinyin7 = "INSERT INTO " + TABLE_PINYIN + " VALUES (7, '" + Pinyins.pinyin6 + "', '" + Tone.tone3 + "', '" + 7 + "');";
    public static final String insertPinyin8 = "INSERT INTO " + TABLE_PINYIN + " VALUES (8, '" + Pinyins.pinyin6 + "', '" + Tone.tone5 + "', '" + 8 + "');";
    public static final String insertPinyin9 = "INSERT INTO " + TABLE_PINYIN + " VALUES (9, '" + Pinyins.pinyin7 + "', '" + Tone.tone1 + "', '" + 9 + "');";
    public static final String insertPinyin10 = "INSERT INTO " + TABLE_PINYIN + " VALUES (10, '" + Pinyins.pinyin8 + "', '" + Tone.tone5 + "', '" + 10 + "');";
    public static final String insertPinyin11 = "INSERT INTO " + TABLE_PINYIN + " VALUES (11, '" + Pinyins.pinyin9 + "', '" + Tone.tone1 + "', '" + 11 + "');";
    public static final String insertPinyin12 = "INSERT INTO " + TABLE_PINYIN + " VALUES (12, '" + Pinyins.pinyin10 + "', '" + Tone.tone2 + "', '" + 12 + "');";
    public static final String insertPinyin13 = "INSERT INTO " + TABLE_PINYIN + " VALUES (13, '" + Pinyins.pinyin11 + "', '" + Tone.tone2 + "', '" + 13 + "');";
    public static final String insertPinyin14 = "INSERT INTO " + TABLE_PINYIN + " VALUES (14, '" + Pinyins.pinyin12 + "', '" + Tone.tone3 + "', '" + 14 + "');";
    public static final String insertPinyin15 = "INSERT INTO " + TABLE_PINYIN + " VALUES (15, '" + Pinyins.pinyin13 + "', '" + Tone.tone4 + "', '" + 15 + "');";
    public static final String insertPinyin16 = "INSERT INTO " + TABLE_PINYIN + " VALUES (16, '" + Pinyins.pinyin14 + "', '" + Tone.tone4 + "', '" + 16 + "');";
    public static final String insertPinyin17 = "INSERT INTO " + TABLE_PINYIN + " VALUES (17, '" + Pinyins.pinyin15 + "', '" + Tone.tone2 + "', '" + 17 + "');";
    public static final String insertPinyin18 = "INSERT INTO " + TABLE_PINYIN + " VALUES (18, '" + Pinyins.pinyin16 + "', '" + Tone.tone2 + "', '" + 18 + "');";
    public static final String insertPinyin19 = "INSERT INTO " + TABLE_PINYIN + " VALUES (19, '" + Pinyins.pinyin17 + "', '" + Tone.tone2 + "', '" + 19 + "');";
    public static final String insertPinyin20 = "INSERT INTO " + TABLE_PINYIN + " VALUES (20, '" + Pinyins.pinyin18 + "', '" + Tone.tone4 + "', '" + 20 + "');";
    public static final String insertPinyin21 = "INSERT INTO " + TABLE_PINYIN + " VALUES (21, '" + Pinyins.pinyin19 + "', '" + Tone.tone1 + "', '" + 21 + "');";
    public static final String insertPinyin22 = "INSERT INTO " + TABLE_PINYIN + " VALUES (22, '" + Pinyins.pinyin20 + "', '" + Tone.tone4 + "', '" + 22 + "');";
    public static final String insertPinyin23 = "INSERT INTO " + TABLE_PINYIN + " VALUES (23, '" + Pinyins.pinyin21 + "', '" + Tone.tone2 + "', '" + 23 + "');";
    public static final String insertPinyin24 = "INSERT INTO " + TABLE_PINYIN + " VALUES (24, '" + Pinyins.pinyin22 + "', '" + Tone.tone4 + "', '" + 24 + "');";
    public static final String insertPinyin25 = "INSERT INTO " + TABLE_PINYIN + " VALUES (25, '" + Pinyins.pinyin23 + "', '" + Tone.tone1 + "', '" + 25 + "');";
    public static final String insertPinyin26 = "INSERT INTO " + TABLE_PINYIN + " VALUES (26, '" + Pinyins.pinyin24 + "', '" + Tone.tone1 + "', '" + 26 + "');";
    public static final String insertPinyin27 = "INSERT INTO " + TABLE_PINYIN + " VALUES (27, '" + Pinyins.pinyin24 + "', '" + Tone.tone4 + "', '" + 27 + "');";
    public static final String insertPinyin28 = "INSERT INTO " + TABLE_PINYIN + " VALUES (28, '" + Pinyins.pinyin25 + "', '" + Tone.tone1 + "', '" + 28 + "');";
    public static final String insertPinyin29 = "INSERT INTO " + TABLE_PINYIN + " VALUES (29, '" + Pinyins.pinyin25 + "', '" + Tone.tone4 + "', '" + 29 + "');";
    public static final String insertPinyin30 = "INSERT INTO " + TABLE_PINYIN + " VALUES (30, '" + Pinyins.pinyin26 + "', '" + Tone.tone2 + "', '" + 30 + "');";
    public static final String insertPinyin31 = "INSERT INTO " + TABLE_PINYIN + " VALUES (31, '" + Pinyins.pinyin27 + "', '" + Tone.tone3 + "', '" + 31 + "');";
    public static final String insertPinyin32 = "INSERT INTO " + TABLE_PINYIN + " VALUES (32, '" + Pinyins.pinyin28 + "', '" + Tone.tone1 + "', '" + 32 + "');";
    public static final String insertPinyin33 = "INSERT INTO " + TABLE_PINYIN + " VALUES (33, '" + Pinyins.pinyin28 + "', '" + Tone.tone2 + "', '" + 33 + "');";
    public static final String insertPinyin34 = "INSERT INTO " + TABLE_PINYIN + " VALUES (34, '" + Pinyins.pinyin29 + "', '" + Tone.tone2 + "', '" + 34 + "');";
    public static final String insertPinyin35 = "INSERT INTO " + TABLE_PINYIN + " VALUES (35, '" + Pinyins.pinyin30 + "', '" + Tone.tone3 + "', '" + 35 + "');";
    public static final String insertPinyin36 = "INSERT INTO " + TABLE_PINYIN + " VALUES (36, '" + Pinyins.pinyin31 + "', '" + Tone.tone3 + "', '" + 36 + "');";
    public static final String insertPinyin37 = "INSERT INTO " + TABLE_PINYIN + " VALUES (37, '" + Pinyins.pinyin32 + "', '" + Tone.tone4 + "', '" + 37 + "');";
    public static final String insertPinyin38 = "INSERT INTO " + TABLE_PINYIN + " VALUES (38, '" + Pinyins.pinyin33 + "', '" + Tone.tone4 + "', '" + 38 + "');";
    public static final String insertPinyin39 = "INSERT INTO " + TABLE_PINYIN + " VALUES (39, '" + Pinyins.pinyin34 + "', '" + Tone.tone1 + "', '" + 39 + "');";
    public static final String insertPinyin40 = "INSERT INTO " + TABLE_PINYIN + " VALUES (40, '" + Pinyins.pinyin35 + "', '" + Tone.tone2 + "', '" + 40 + "');";
    public static final String insertPinyin41 = "INSERT INTO " + TABLE_PINYIN + " VALUES (41, '" + Pinyins.pinyin36 + "', '" + Tone.tone4 + "', '" + 41 + "');";
    public static final String insertPinyin42 = "INSERT INTO " + TABLE_PINYIN + " VALUES (42, '" + Pinyins.pinyin37 + "', '" + Tone.tone4 + "', '" + 42 + "');";
    public static final String insertPinyin43 = "INSERT INTO " + TABLE_PINYIN + " VALUES (43, '" + Pinyins.pinyin38 + "', '" + Tone.tone1 + "', '" + 43 + "');";
    public static final String insertPinyin44 = "INSERT INTO " + TABLE_PINYIN + " VALUES (44, '" + Pinyins.pinyin39 + "', '" + Tone.tone3 + "', '" + 44 + "');";
    public static final String insertPinyin45 = "INSERT INTO " + TABLE_PINYIN + " VALUES (45, '" + Pinyins.pinyin40 + "', '" + Tone.tone3 + "', '" + 45 + "');";
    public static final String insertPinyin46 = "INSERT INTO " + TABLE_PINYIN + " VALUES (46, '" + Pinyins.pinyin41 + "', '" + Tone.tone4 + "', '" + 46 + "');";
    public static final String insertPinyin47 = "INSERT INTO " + TABLE_PINYIN + " VALUES (47, '" + Pinyins.pinyin42 + "', '" + Tone.tone3 + "', '" + 47 + "');";
    public static final String insertPinyin48 = "INSERT INTO " + TABLE_PINYIN + " VALUES (48, '" + Pinyins.pinyin43 + "', '" + Tone.tone4 + "', '" + 48 + "');";
    public static final String insertPinyin49 = "INSERT INTO " + TABLE_PINYIN + " VALUES (49, '" + Pinyins.pinyin44 + "', '" + Tone.tone4 + "', '" + 49 + "');";
    public static final String insertPinyin50 = "INSERT INTO " + TABLE_PINYIN + " VALUES (50, '" + Pinyins.pinyin45 + "', '" + Tone.tone1 + "', '" + 50 + "');";
    public static final String insertPinyin51 = "INSERT INTO " + TABLE_PINYIN + " VALUES (51, '" + Pinyins.pinyin46 + "', '" + Tone.tone4 + "', '" + 51 + "');";
    public static final String insertPinyin52 = "INSERT INTO " + TABLE_PINYIN + " VALUES (52, '" + Pinyins.pinyin47 + "', '" + Tone.tone3 + "', '" + 52 + "');";
    public static final String insertPinyin53 = "INSERT INTO " + TABLE_PINYIN + " VALUES (53, '" + Pinyins.pinyin48 + "', '" + Tone.tone4 + "', '" + 53 + "');";
    public static final String insertPinyin54 = "INSERT INTO " + TABLE_PINYIN + " VALUES (54, '" + Pinyins.pinyin49 + "', '" + Tone.tone4 + "', '" + 54 + "');";
    public static final String insertPinyin55 = "INSERT INTO " + TABLE_PINYIN + " VALUES (55, '" + Pinyins.pinyin50 + "', '" + Tone.tone2 + "', '" + 55 + "');";
    public static final String insertPinyin56 = "INSERT INTO " + TABLE_PINYIN + " VALUES (56, '" + Pinyins.pinyin51 + "', '" + Tone.tone3 + "', '" + 56 + "');";

    /**
     * Part Sounds
     * */
    public static final String insertSound1 = "INSERT INTO " + TABLE_SOUND + " VALUES (1, '" + UrlSound.urlSound1 + "', 1);";
    public static final String insertSound2 = "INSERT INTO " + TABLE_SOUND + " VALUES (2, '" + UrlSound.urlSound2 + "', 2);";
    public static final String insertSound3 = "INSERT INTO " + TABLE_SOUND + " VALUES (3, '" + UrlSound.urlSound3 + "', 3);";
    public static final String insertSound4 = "INSERT INTO " + TABLE_SOUND + " VALUES (4, '" + UrlSound.urlSound4 + "', 4);";
    public static final String insertSound5 = "INSERT INTO " + TABLE_SOUND + " VALUES (5, '" + UrlSound.urlSound5 + "', 5);";
    public static final String insertSound6 = "INSERT INTO " + TABLE_SOUND + " VALUES (6, '" + UrlSound.urlSound6 + "', 6);";
    public static final String insertSound7 = "INSERT INTO " + TABLE_SOUND + " VALUES (7, '" + UrlSound.urlSound7 + "', 7);";
    public static final String insertSound8 = "INSERT INTO " + TABLE_SOUND + " VALUES (8, '" + UrlSound.urlSound8 + "', 8);";
    public static final String insertSound9 = "INSERT INTO " + TABLE_SOUND + " VALUES (9, '" + UrlSound.urlSound9 + "', 9);";
    public static final String insertSound10 = "INSERT INTO " + TABLE_SOUND + " VALUES (10, '" + UrlSound.urlSound10 + "', 10);";
    public static final String insertSound11 = "INSERT INTO " + TABLE_SOUND + " VALUES (11, '" + UrlSound.urlSound11 + "', 11);";
    public static final String insertSound12 = "INSERT INTO " + TABLE_SOUND + " VALUES (12, '" + UrlSound.urlSound12 + "', 12);";
    public static final String insertSound13 = "INSERT INTO " + TABLE_SOUND + " VALUES (13, '" + UrlSound.urlSound13 + "', 13);";
    public static final String insertSound14 = "INSERT INTO " + TABLE_SOUND + " VALUES (14, '" + UrlSound.urlSound14 + "', 14);";
    public static final String insertSound15 = "INSERT INTO " + TABLE_SOUND + " VALUES (15, '" + UrlSound.urlSound15 + "', 15);";
    public static final String insertSound16 = "INSERT INTO " + TABLE_SOUND + " VALUES (16, '" + UrlSound.urlSound16 + "', 16);";
    public static final String insertSound17 = "INSERT INTO " + TABLE_SOUND + " VALUES (17, '" + UrlSound.urlSound17 + "', 17);";
    public static final String insertSound18 = "INSERT INTO " + TABLE_SOUND + " VALUES (18, '" + UrlSound.urlSound18 + "', 18);";
    public static final String insertSound19 = "INSERT INTO " + TABLE_SOUND + " VALUES (19, '" + UrlSound.urlSound19 + "', 19);";
    public static final String insertSound20 = "INSERT INTO " + TABLE_SOUND + " VALUES (20, '" + UrlSound.urlSound20 + "', 20);";
    public static final String insertSound21 = "INSERT INTO " + TABLE_SOUND + " VALUES (21, '" + UrlSound.urlSound21 + "', 21);";
    public static final String insertSound22 = "INSERT INTO " + TABLE_SOUND + " VALUES (22, '" + UrlSound.urlSound22 + "', 22);";
    public static final String insertSound23 = "INSERT INTO " + TABLE_SOUND + " VALUES (23, '" + UrlSound.urlSound23 + "', 23);";
    public static final String insertSound24 = "INSERT INTO " + TABLE_SOUND + " VALUES (24, '" + UrlSound.urlSound24 + "', 24);";
    public static final String insertSound25 = "INSERT INTO " + TABLE_SOUND + " VALUES (25, '" + UrlSound.urlSound25 + "', 25);";
    public static final String insertSound26 = "INSERT INTO " + TABLE_SOUND + " VALUES (26, '" + UrlSound.urlSound26 + "', 26);";
    public static final String insertSound27 = "INSERT INTO " + TABLE_SOUND + " VALUES (27, '" + UrlSound.urlSound27 + "', 27);";
    public static final String insertSound28 = "INSERT INTO " + TABLE_SOUND + " VALUES (28, '" + UrlSound.urlSound28 + "', 28);";
    public static final String insertSound29 = "INSERT INTO " + TABLE_SOUND + " VALUES (29, '" + UrlSound.urlSound29 + "', 29);";
    public static final String insertSound30 = "INSERT INTO " + TABLE_SOUND + " VALUES (30, '" + UrlSound.urlSound30 + "', 30);";
    public static final String insertSound31 = "INSERT INTO " + TABLE_SOUND + " VALUES (31, '" + UrlSound.urlSound31 + "', 31);";
    public static final String insertSound32 = "INSERT INTO " + TABLE_SOUND + " VALUES (32, '" + UrlSound.urlSound32 + "', 32);";
    public static final String insertSound33 = "INSERT INTO " + TABLE_SOUND + " VALUES (33, '" + UrlSound.urlSound33 + "', 33);";
    public static final String insertSound34 = "INSERT INTO " + TABLE_SOUND + " VALUES (34, '" + UrlSound.urlSound34 + "', 34);";
    public static final String insertSound35 = "INSERT INTO " + TABLE_SOUND + " VALUES (35, '" + UrlSound.urlSound35 + "', 35);";
    public static final String insertSound36 = "INSERT INTO " + TABLE_SOUND + " VALUES (36, '" + UrlSound.urlSound36 + "', 36);";
    public static final String insertSound37 = "INSERT INTO " + TABLE_SOUND + " VALUES (37, '" + UrlSound.urlSound37 + "', 37);";
    public static final String insertSound38 = "INSERT INTO " + TABLE_SOUND + " VALUES (38, '" + UrlSound.urlSound38 + "', 38);";
    public static final String insertSound39 = "INSERT INTO " + TABLE_SOUND + " VALUES (39, '" + UrlSound.urlSound39 + "', 39);";
    public static final String insertSound40 = "INSERT INTO " + TABLE_SOUND + " VALUES (40, '" + UrlSound.urlSound40 + "', 40);";
    public static final String insertSound41 = "INSERT INTO " + TABLE_SOUND + " VALUES (41, '" + UrlSound.urlSound41 + "', 41);";
    public static final String insertSound42 = "INSERT INTO " + TABLE_SOUND + " VALUES (42, '" + UrlSound.urlSound42 + "', 42);";
    public static final String insertSound43 = "INSERT INTO " + TABLE_SOUND + " VALUES (43, '" + UrlSound.urlSound43 + "', 43);";
    public static final String insertSound44 = "INSERT INTO " + TABLE_SOUND + " VALUES (44, '" + UrlSound.urlSound44 + "', 44);";
    public static final String insertSound45 = "INSERT INTO " + TABLE_SOUND + " VALUES (45, '" + UrlSound.urlSound45 + "', 45);";
    public static final String insertSound46 = "INSERT INTO " + TABLE_SOUND + " VALUES (46, '" + UrlSound.urlSound46 + "', 46);";
    public static final String insertSound47 = "INSERT INTO " + TABLE_SOUND + " VALUES (47, '" + UrlSound.urlSound47 + "', 47);";
    public static final String insertSound48 = "INSERT INTO " + TABLE_SOUND + " VALUES (48, '" + UrlSound.urlSound48 + "', 48);";
    public static final String insertSound49 = "INSERT INTO " + TABLE_SOUND + " VALUES (49, '" + UrlSound.urlSound49 + "', 49);";
    public static final String insertSound50 = "INSERT INTO " + TABLE_SOUND + " VALUES (50, '" + UrlSound.urlSound50 + "', 50);";
    public static final String insertSound51 = "INSERT INTO " + TABLE_SOUND + " VALUES (51, '" + UrlSound.urlSound51 + "', 51);";
    public static final String insertSound52 = "INSERT INTO " + TABLE_SOUND + " VALUES (52, '" + UrlSound.urlSound52 + "', 52);";
    public static final String insertSound53 = "INSERT INTO " + TABLE_SOUND + " VALUES (53, '" + UrlSound.urlSound53 + "', 53);";
    public static final String insertSound54 = "INSERT INTO " + TABLE_SOUND + " VALUES (54, '" + UrlSound.urlSound54 + "', 54);";
    public static final String insertSound55 = "INSERT INTO " + TABLE_SOUND + " VALUES (55, '" + UrlSound.urlSound55 + "', 55);";
    public static final String insertSound56 = "INSERT INTO " + TABLE_SOUND + " VALUES (56, '" + UrlSound.urlSound56 + "', 56);";

    /**
     * Part Hanzi_Pinyin
     * */
    public static final String insertHanziPinyin1 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (1, 1, 1, '" + WordInEnglish.wordInEnglish1 + "', '" + WordInSpanish.wordInSpanish1 + "');";
    public static final String insertHanziPinyin2 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (2, 1, 2, '" + WordInEnglish.wordInEnglish2 + "', '" + WordInSpanish.wordInSpanish2 + "');";
    public static final String insertHanziPinyin3 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (3, 2, 3, '" + WordInEnglish.wordInEnglish3 + "', '" + WordInSpanish.wordInSpanish3 + "');";
    public static final String insertHanziPinyin4 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (4, 3, 4, '" + WordInEnglish.wordInEnglish4 + "', '" + WordInSpanish.wordInSpanish4 + "');";
    public static final String insertHanziPinyin5 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (5, 4, 5, '" + WordInEnglish.wordInEnglish5 + "', '" + WordInSpanish.wordInSpanish5 + "');";
    public static final String insertHanziPinyin6 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (6, 5, 6, '" + WordInEnglish.wordInEnglish6 + "', '" + WordInSpanish.wordInSpanish6 + "');";
    public static final String insertHanziPinyin7 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (7, 6, 7, '" + WordInEnglish.wordInEnglish7 + "', '" + WordInSpanish.wordInSpanish7 + "');";
    public static final String insertHanziPinyin8 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (8, 6, 8, '" + WordInEnglish.wordInEnglish8 + "', '" + WordInSpanish.wordInSpanish8 + "');";
    public static final String insertHanziPinyin9 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (9, 7, 9, '" + WordInEnglish.wordInEnglish9 + "', '" + WordInSpanish.wordInSpanish9 + "');";
    public static final String insertHanziPinyin10 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (10, 8, 10, '" + WordInEnglish.wordInEnglish10 + "', '" + WordInSpanish.wordInSpanish10 + "');";
    public static final String insertHanziPinyin11 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (11, 9, 11, '" + WordInEnglish.wordInEnglish11 + "', '" + WordInSpanish.wordInSpanish11 + "');";
    public static final String insertHanziPinyin12 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (12, 10, 12, '" + WordInEnglish.wordInEnglish12 + "', '" + WordInSpanish.wordInSpanish12 + "');";
    public static final String insertHanziPinyin13 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (13, 11, 13, '" + WordInEnglish.wordInEnglish13 + "', '" + WordInSpanish.wordInSpanish13 + "');";
    public static final String insertHanziPinyin14 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (14, 12, 14, '" + WordInEnglish.wordInEnglish14 + "', '" + WordInSpanish.wordInSpanish14 + "');";
    public static final String insertHanziPinyin15 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (15, 13, 15, '" + WordInEnglish.wordInEnglish15 + "', '" + WordInSpanish.wordInSpanish15 + "');";
    public static final String insertHanziPinyin16 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (16, 14, 16, '" + WordInEnglish.wordInEnglish16 + "', '" + WordInSpanish.wordInSpanish16 + "');";
    public static final String insertHanziPinyin17 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (17, 15, 17, '" + WordInEnglish.wordInEnglish17 + "', '" + WordInSpanish.wordInSpanish17 + "');";
    public static final String insertHanziPinyin18 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (18, 16, 18, '" + WordInEnglish.wordInEnglish18 + "', '" + WordInSpanish.wordInSpanish18 + "');";
    public static final String insertHanziPinyin19 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (19, 17, 19, '" + WordInEnglish.wordInEnglish19 + "', '" + WordInSpanish.wordInSpanish19 + "');";
    public static final String insertHanziPinyin20 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (20, 18, 20, '" + WordInEnglish.wordInEnglish20 + "', '" + WordInSpanish.wordInSpanish20 + "');";
    public static final String insertHanziPinyin21 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (21, 19, 21, '" + WordInEnglish.wordInEnglish21 + "', '" + WordInSpanish.wordInSpanish21 + "');";
    public static final String insertHanziPinyin22 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (22, 20, 22, '" + WordInEnglish.wordInEnglish22 + "', '" + WordInSpanish.wordInSpanish22 + "');";
    public static final String insertHanziPinyin23 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (23, 21, 23, '" + WordInEnglish.wordInEnglish23 + "', '" + WordInSpanish.wordInSpanish23 + "');";
    public static final String insertHanziPinyin24 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (24, 22, 24, '" + WordInEnglish.wordInEnglish24 + "', '" + WordInSpanish.wordInSpanish24 + "');";
    public static final String insertHanziPinyin25 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (25, 23, 25, '" + WordInEnglish.wordInEnglish25 + "', '" + WordInSpanish.wordInSpanish25 + "');";
    public static final String insertHanziPinyin26 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (26, 24, 26, '" + WordInEnglish.wordInEnglish26 + "', '" + WordInSpanish.wordInSpanish26 + "');";
    public static final String insertHanziPinyin27 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (27, 24, 27, '" + WordInEnglish.wordInEnglish27 + "', '" + WordInSpanish.wordInSpanish27 + "');";
    public static final String insertHanziPinyin28 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (28, 25, 28, '" + WordInEnglish.wordInEnglish28 + "', '" + WordInSpanish.wordInSpanish28 + "');";
    public static final String insertHanziPinyin29 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (29, 25, 29, '" + WordInEnglish.wordInEnglish29 + "', '" + WordInSpanish.wordInSpanish29 + "');";
    public static final String insertHanziPinyin30 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (30, 26, 30, '" + WordInEnglish.wordInEnglish30 + "', '" + WordInSpanish.wordInSpanish30 + "');";
    public static final String insertHanziPinyin31 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (31, 26, 31, '" + WordInEnglish.wordInEnglish31 + "', '" + WordInSpanish.wordInSpanish31 + "');";
    public static final String insertHanziPinyin32 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (32, 27, 32, '" + WordInEnglish.wordInEnglish32 + "', '" + WordInSpanish.wordInSpanish32 + "');";
    public static final String insertHanziPinyin33 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (33, 27, 33, '" + WordInEnglish.wordInEnglish33 + "', '" + WordInSpanish.wordInSpanish33 + "');";
    public static final String insertHanziPinyin34 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (34, 28, 34, '" + WordInEnglish.wordInEnglish34 + "', '" + WordInSpanish.wordInSpanish34 + "');";
    public static final String insertHanziPinyin35 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (35, 29, 35, '" + WordInEnglish.wordInEnglish35 + "', '" + WordInSpanish.wordInSpanish35 + "');";
    public static final String insertHanziPinyin36 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (36, 30, 36, '" + WordInEnglish.wordInEnglish36 + "', '" + WordInSpanish.wordInSpanish36 + "');";
    public static final String insertHanziPinyin37 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (37, 31, 37, '" + WordInEnglish.wordInEnglish37 + "', '" + WordInSpanish.wordInSpanish37 + "');";
    public static final String insertHanziPinyin38 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (38, 32, 38, '" + WordInEnglish.wordInEnglish38 + "', '" + WordInSpanish.wordInSpanish38 + "');";
    public static final String insertHanziPinyin39 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (39, 33, 39, '" + WordInEnglish.wordInEnglish39 + "', '" + WordInSpanish.wordInSpanish39 + "');";
    public static final String insertHanziPinyin40 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (40, 34, 40, '" + WordInEnglish.wordInEnglish40 + "', '" + WordInSpanish.wordInSpanish40 + "');";
    public static final String insertHanziPinyin41 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (41, 35, 41, '" + WordInEnglish.wordInEnglish41 + "', '" + WordInSpanish.wordInSpanish41 + "');";
    public static final String insertHanziPinyin42 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (42, 36, 42, '" + WordInEnglish.wordInEnglish42 + "', '" + WordInSpanish.wordInSpanish42 + "');";
    public static final String insertHanziPinyin43 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (43, 37, 43, '" + WordInEnglish.wordInEnglish43 + "', '" + WordInSpanish.wordInSpanish43 + "');";
    public static final String insertHanziPinyin44 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (44, 38, 44, '" + WordInEnglish.wordInEnglish44 + "', '" + WordInSpanish.wordInSpanish44 + "');";
    public static final String insertHanziPinyin45 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (45, 39, 45, '" + WordInEnglish.wordInEnglish45 + "', '" + WordInSpanish.wordInSpanish45 + "');";
    public static final String insertHanziPinyin46 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (46, 40, 46, '" + WordInEnglish.wordInEnglish46 + "', '" + WordInSpanish.wordInSpanish46 + "');";
    public static final String insertHanziPinyin47 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (47, 41, 47, '" + WordInEnglish.wordInEnglish47 + "', '" + WordInSpanish.wordInSpanish47 + "');";
    public static final String insertHanziPinyin48 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (48, 42, 48, '" + WordInEnglish.wordInEnglish48 + "', '" + WordInSpanish.wordInSpanish48 + "');";
    public static final String insertHanziPinyin49 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (49, 43, 49, '" + WordInEnglish.wordInEnglish49 + "', '" + WordInSpanish.wordInSpanish49 + "');";
    public static final String insertHanziPinyin50 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (50, 44, 50, '" + WordInEnglish.wordInEnglish50 + "', '" + WordInSpanish.wordInSpanish50 + "');";
    public static final String insertHanziPinyin51 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (51, 45, 51, '" + WordInEnglish.wordInEnglish51 + "', '" + WordInSpanish.wordInSpanish51 + "');";
    public static final String insertHanziPinyin52 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (52, 46, 52, '" + WordInEnglish.wordInEnglish52 + "', '" + WordInSpanish.wordInSpanish52 + "');";
    public static final String insertHanziPinyin53 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (53, 47, 53, '" + WordInEnglish.wordInEnglish53 + "', '" + WordInSpanish.wordInSpanish53 + "');";
    public static final String insertHanziPinyin54 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (54, 48, 54, '" + WordInEnglish.wordInEnglish54 + "', '" + WordInSpanish.wordInSpanish54 + "');";
    public static final String insertHanziPinyin55 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (55, 49, 55, '" + WordInEnglish.wordInEnglish55 + "', '" + WordInSpanish.wordInSpanish55 + "');";
    public static final String insertHanziPinyin56 = "INSERT INTO " + TABLE_HANZI_PINYIN + " VALUES (56, 50, 56, '" + WordInEnglish.wordInEnglish56 + "', '" + WordInSpanish.wordInSpanish56 + "');";
    
}
