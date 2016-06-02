package com.example.uhlexy.hanziFirst.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.uhlexy.hanziFirst.dml.InsertQueries;
import com.example.uhlexy.hanziFirst.model.Hanzi;
import com.example.uhlexy.hanziFirst.model.Pinyin;
import com.example.uhlexy.hanziFirst.model.Sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Database Helper
 * Created by Yincong on 28/04/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    /**
     * Logcat pinyin
     */
    private static final String LOG = "DatabaseHelper";

    /**
     * Database Version
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Database Name
     */
    private static final String DATABASE_NAME = "hanzisManager";

    /**
     * Table Names
     */
    private static final String TABLE_HANZI = "hanzi";
    private static final String TABLE_PINYIN = "pinyin";
    private static final String TABLE_HANZI_PINYIN = "hanzi_pinyin";
    private static final String TABLE_SOUND = "sound";

    /**
     * Common column names
     */
    private static final String KEY_ID = "id";

    /**
     * HANZI Table - column nmaes
     */
    private static final String KEY_CHARACTER_HANZI = "character_hanzi";

    /**
     * PINYIN Table - column names
     */
    private static final String KEY_PINYIN = "pinyin";
    private static final String KEY_TONE = "tone";
    private static final String KEY_SOUND_ID = "sound_id";

    /**
     * SOUND Table - column names
     */
    private static final String KEY_URL_SOUND = "url_sound";

    /**
     * HANZI_PINYINS Table - column names
     */
    private static final String KEY_HANZI_ID = "hanzi_id";
    private static final String KEY_PINYIN_ID = "pinyin_id";
    private static final String KEY_WORD_IN_ENGLISH = "word_in_english";
    private static final String KEY_WORD_IN_SPANISH = "word_in_spanish";

    // Table Create Statements
    /**
     * Hanzi table create statement
     */
    private static final String CREATE_TABLE_HANZI = "CREATE TABLE IF NOT EXISTS "
            + TABLE_HANZI + "(" + KEY_HANZI_ID + " INTEGER PRIMARY KEY," + KEY_CHARACTER_HANZI
            + " TEXT" + ")";

    /**
     * Pinyin table create statement
     */
    private static final String CREATE_TABLE_PINYIN = "CREATE TABLE IF NOT EXISTS " + TABLE_PINYIN
            + "(" + KEY_PINYIN_ID + " INTEGER PRIMARY KEY," + KEY_PINYIN + " TEXT,"
            + KEY_TONE + " TEXT," + KEY_SOUND_ID + " INTEGER," +
            "FOREIGN KEY( " + KEY_SOUND_ID + ") REFERENCES " + TABLE_SOUND + " ( " + KEY_SOUND_ID + " ) )";

    /**
     * Sound table create statement
     */
    private static final String CREATE_TABLE_SOUND = "CREATE TABLE IF NOT EXISTS " + TABLE_SOUND
            + "(" + KEY_SOUND_ID + " INTEGER PRIMARY KEY," + KEY_URL_SOUND + " TEXT,"
            + KEY_PINYIN_ID + " INTEGER," + "FOREIGN KEY( " + KEY_PINYIN_ID
            + ") REFERENCES " + TABLE_PINYIN + " ( " + KEY_PINYIN_ID + " ) )";

    /**
     * hanzi_pinyin table create statement
     */
    private static final String CREATE_TABLE_HANZI_PINYIN = "CREATE TABLE "
            + TABLE_HANZI_PINYIN + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_HANZI_ID + " INTEGER," + KEY_PINYIN_ID + " INTEGER,"
            + KEY_WORD_IN_ENGLISH + " TEXT," + KEY_WORD_IN_SPANISH + " TEXT"
            + ")";

    private static DatabaseHelper instance;

    public static synchronized DatabaseHelper getHelper(Context context) {
        if (instance == null)
            instance = new DatabaseHelper(context);
        return instance;
    }

    /**
     * Constructor
     */
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        /**
         * creating required tables
         * */
        db.execSQL(CREATE_TABLE_HANZI);
        db.execSQL(CREATE_TABLE_PINYIN);
        db.execSQL(CREATE_TABLE_HANZI_PINYIN);
        db.execSQL(CREATE_TABLE_SOUND);

        /**
         * Insert datos
         * */
        // Part Hanzi
        db.execSQL(InsertQueries.insertHanzi1);
        db.execSQL(InsertQueries.insertHanzi2);
        db.execSQL(InsertQueries.insertHanzi3);
        db.execSQL(InsertQueries.insertHanzi4);
        db.execSQL(InsertQueries.insertHanzi5);
        db.execSQL(InsertQueries.insertHanzi6);
        db.execSQL(InsertQueries.insertHanzi7);
        db.execSQL(InsertQueries.insertHanzi8);
        db.execSQL(InsertQueries.insertHanzi9);
        db.execSQL(InsertQueries.insertHanzi10);
        db.execSQL(InsertQueries.insertHanzi11);
        db.execSQL(InsertQueries.insertHanzi12);
        db.execSQL(InsertQueries.insertHanzi13);
        db.execSQL(InsertQueries.insertHanzi14);
        db.execSQL(InsertQueries.insertHanzi15);
        db.execSQL(InsertQueries.insertHanzi16);
        db.execSQL(InsertQueries.insertHanzi17);
        db.execSQL(InsertQueries.insertHanzi18);
        db.execSQL(InsertQueries.insertHanzi19);
        db.execSQL(InsertQueries.insertHanzi20);
        db.execSQL(InsertQueries.insertHanzi21);
        db.execSQL(InsertQueries.insertHanzi22);
        db.execSQL(InsertQueries.insertHanzi23);
        db.execSQL(InsertQueries.insertHanzi24);
        db.execSQL(InsertQueries.insertHanzi25);
        db.execSQL(InsertQueries.insertHanzi26);
        db.execSQL(InsertQueries.insertHanzi27);
        db.execSQL(InsertQueries.insertHanzi28);
        db.execSQL(InsertQueries.insertHanzi29);
        db.execSQL(InsertQueries.insertHanzi30);
        db.execSQL(InsertQueries.insertHanzi31);
        db.execSQL(InsertQueries.insertHanzi32);
        db.execSQL(InsertQueries.insertHanzi33);
        db.execSQL(InsertQueries.insertHanzi34);
        db.execSQL(InsertQueries.insertHanzi35);
        db.execSQL(InsertQueries.insertHanzi36);
        db.execSQL(InsertQueries.insertHanzi37);
        db.execSQL(InsertQueries.insertHanzi38);
        db.execSQL(InsertQueries.insertHanzi39);
        db.execSQL(InsertQueries.insertHanzi40);
        db.execSQL(InsertQueries.insertHanzi41);
        db.execSQL(InsertQueries.insertHanzi42);
        db.execSQL(InsertQueries.insertHanzi43);
        db.execSQL(InsertQueries.insertHanzi44);
        db.execSQL(InsertQueries.insertHanzi45);
        db.execSQL(InsertQueries.insertHanzi46);
        db.execSQL(InsertQueries.insertHanzi47);
        db.execSQL(InsertQueries.insertHanzi48);
        db.execSQL(InsertQueries.insertHanzi49);
        db.execSQL(InsertQueries.insertHanzi50);

        // Part Pinyin
        db.execSQL(InsertQueries.insertPinyin1);
        db.execSQL(InsertQueries.insertPinyin2);
        db.execSQL(InsertQueries.insertPinyin3);
        db.execSQL(InsertQueries.insertPinyin4);
        db.execSQL(InsertQueries.insertPinyin5);
        db.execSQL(InsertQueries.insertPinyin6);
        db.execSQL(InsertQueries.insertPinyin7);
        db.execSQL(InsertQueries.insertPinyin8);
        db.execSQL(InsertQueries.insertPinyin9);
        db.execSQL(InsertQueries.insertPinyin10);
        db.execSQL(InsertQueries.insertPinyin11);
        db.execSQL(InsertQueries.insertPinyin12);
        db.execSQL(InsertQueries.insertPinyin13);
        db.execSQL(InsertQueries.insertPinyin14);
        db.execSQL(InsertQueries.insertPinyin15);
        db.execSQL(InsertQueries.insertPinyin16);
        db.execSQL(InsertQueries.insertPinyin17);
        db.execSQL(InsertQueries.insertPinyin18);
        db.execSQL(InsertQueries.insertPinyin19);
        db.execSQL(InsertQueries.insertPinyin20);
        db.execSQL(InsertQueries.insertPinyin21);
        db.execSQL(InsertQueries.insertPinyin22);
        db.execSQL(InsertQueries.insertPinyin23);
        db.execSQL(InsertQueries.insertPinyin24);
        db.execSQL(InsertQueries.insertPinyin25);
        db.execSQL(InsertQueries.insertPinyin26);
        db.execSQL(InsertQueries.insertPinyin27);
        db.execSQL(InsertQueries.insertPinyin28);
        db.execSQL(InsertQueries.insertPinyin29);
        db.execSQL(InsertQueries.insertPinyin30);
        db.execSQL(InsertQueries.insertPinyin31);
        db.execSQL(InsertQueries.insertPinyin32);
        db.execSQL(InsertQueries.insertPinyin33);
        db.execSQL(InsertQueries.insertPinyin34);
        db.execSQL(InsertQueries.insertPinyin35);
        db.execSQL(InsertQueries.insertPinyin36);
        db.execSQL(InsertQueries.insertPinyin37);
        db.execSQL(InsertQueries.insertPinyin38);
        db.execSQL(InsertQueries.insertPinyin39);
        db.execSQL(InsertQueries.insertPinyin40);
        db.execSQL(InsertQueries.insertPinyin41);
        db.execSQL(InsertQueries.insertPinyin42);
        db.execSQL(InsertQueries.insertPinyin43);
        db.execSQL(InsertQueries.insertPinyin44);
        db.execSQL(InsertQueries.insertPinyin45);
        db.execSQL(InsertQueries.insertPinyin46);
        db.execSQL(InsertQueries.insertPinyin47);
        db.execSQL(InsertQueries.insertPinyin48);
        db.execSQL(InsertQueries.insertPinyin49);
        db.execSQL(InsertQueries.insertPinyin50);
        db.execSQL(InsertQueries.insertPinyin51);
        db.execSQL(InsertQueries.insertPinyin52);
        db.execSQL(InsertQueries.insertPinyin53);
        db.execSQL(InsertQueries.insertPinyin54);
        db.execSQL(InsertQueries.insertPinyin55);
        db.execSQL(InsertQueries.insertPinyin56);

        // Part Sound
        db.execSQL(InsertQueries.insertSound1);
        db.execSQL(InsertQueries.insertSound2);
        db.execSQL(InsertQueries.insertSound3);
        db.execSQL(InsertQueries.insertSound4);
        db.execSQL(InsertQueries.insertSound5);
        db.execSQL(InsertQueries.insertSound6);
        db.execSQL(InsertQueries.insertSound7);
        db.execSQL(InsertQueries.insertSound8);
        db.execSQL(InsertQueries.insertSound9);
        db.execSQL(InsertQueries.insertSound10);
        db.execSQL(InsertQueries.insertSound11);
        db.execSQL(InsertQueries.insertSound12);
        db.execSQL(InsertQueries.insertSound13);
        db.execSQL(InsertQueries.insertSound14);
        db.execSQL(InsertQueries.insertSound15);
        db.execSQL(InsertQueries.insertSound16);
        db.execSQL(InsertQueries.insertSound17);
        db.execSQL(InsertQueries.insertSound18);
        db.execSQL(InsertQueries.insertSound19);
        db.execSQL(InsertQueries.insertSound20);
        db.execSQL(InsertQueries.insertSound21);
        db.execSQL(InsertQueries.insertSound22);
        db.execSQL(InsertQueries.insertSound23);
        db.execSQL(InsertQueries.insertSound24);
        db.execSQL(InsertQueries.insertSound25);
        db.execSQL(InsertQueries.insertSound26);
        db.execSQL(InsertQueries.insertSound27);
        db.execSQL(InsertQueries.insertSound28);
        db.execSQL(InsertQueries.insertSound29);
        db.execSQL(InsertQueries.insertSound30);
        db.execSQL(InsertQueries.insertSound31);
        db.execSQL(InsertQueries.insertSound32);
        db.execSQL(InsertQueries.insertSound33);
        db.execSQL(InsertQueries.insertSound34);
        db.execSQL(InsertQueries.insertSound35);
        db.execSQL(InsertQueries.insertSound36);
        db.execSQL(InsertQueries.insertSound37);
        db.execSQL(InsertQueries.insertSound38);
        db.execSQL(InsertQueries.insertSound39);
        db.execSQL(InsertQueries.insertSound40);
        db.execSQL(InsertQueries.insertSound41);
        db.execSQL(InsertQueries.insertSound42);
        db.execSQL(InsertQueries.insertSound43);
        db.execSQL(InsertQueries.insertSound44);
        db.execSQL(InsertQueries.insertSound45);
        db.execSQL(InsertQueries.insertSound46);
        db.execSQL(InsertQueries.insertSound47);
        db.execSQL(InsertQueries.insertSound48);
        db.execSQL(InsertQueries.insertSound49);
        db.execSQL(InsertQueries.insertSound50);
        db.execSQL(InsertQueries.insertSound51);
        db.execSQL(InsertQueries.insertSound52);
        db.execSQL(InsertQueries.insertSound53);
        db.execSQL(InsertQueries.insertSound54);
        db.execSQL(InsertQueries.insertSound55);
        db.execSQL(InsertQueries.insertSound56);

        // Part Hanzi_Pinyin
        db.execSQL(InsertQueries.insertHanziPinyin1);
        db.execSQL(InsertQueries.insertHanziPinyin2);
        db.execSQL(InsertQueries.insertHanziPinyin3);
        db.execSQL(InsertQueries.insertHanziPinyin4);
        db.execSQL(InsertQueries.insertHanziPinyin5);
        db.execSQL(InsertQueries.insertHanziPinyin6);
        db.execSQL(InsertQueries.insertHanziPinyin7);
        db.execSQL(InsertQueries.insertHanziPinyin8);
        db.execSQL(InsertQueries.insertHanziPinyin9);
        db.execSQL(InsertQueries.insertHanziPinyin10);
        db.execSQL(InsertQueries.insertHanziPinyin11);
        db.execSQL(InsertQueries.insertHanziPinyin12);
        db.execSQL(InsertQueries.insertHanziPinyin13);
        db.execSQL(InsertQueries.insertHanziPinyin14);
        db.execSQL(InsertQueries.insertHanziPinyin15);
        db.execSQL(InsertQueries.insertHanziPinyin16);
        db.execSQL(InsertQueries.insertHanziPinyin17);
        db.execSQL(InsertQueries.insertHanziPinyin18);
        db.execSQL(InsertQueries.insertHanziPinyin19);
        db.execSQL(InsertQueries.insertHanziPinyin20);
        db.execSQL(InsertQueries.insertHanziPinyin21);
        db.execSQL(InsertQueries.insertHanziPinyin22);
        db.execSQL(InsertQueries.insertHanziPinyin23);
        db.execSQL(InsertQueries.insertHanziPinyin24);
        db.execSQL(InsertQueries.insertHanziPinyin25);
        db.execSQL(InsertQueries.insertHanziPinyin26);
        db.execSQL(InsertQueries.insertHanziPinyin27);
        db.execSQL(InsertQueries.insertHanziPinyin28);
        db.execSQL(InsertQueries.insertHanziPinyin29);
        db.execSQL(InsertQueries.insertHanziPinyin30);
        db.execSQL(InsertQueries.insertHanziPinyin31);
        db.execSQL(InsertQueries.insertHanziPinyin32);
        db.execSQL(InsertQueries.insertHanziPinyin33);
        db.execSQL(InsertQueries.insertHanziPinyin34);
        db.execSQL(InsertQueries.insertHanziPinyin35);
        db.execSQL(InsertQueries.insertHanziPinyin36);
        db.execSQL(InsertQueries.insertHanziPinyin37);
        db.execSQL(InsertQueries.insertHanziPinyin38);
        db.execSQL(InsertQueries.insertHanziPinyin39);
        db.execSQL(InsertQueries.insertHanziPinyin40);
        db.execSQL(InsertQueries.insertHanziPinyin41);
        db.execSQL(InsertQueries.insertHanziPinyin42);
        db.execSQL(InsertQueries.insertHanziPinyin43);
        db.execSQL(InsertQueries.insertHanziPinyin44);
        db.execSQL(InsertQueries.insertHanziPinyin45);
        db.execSQL(InsertQueries.insertHanziPinyin46);
        db.execSQL(InsertQueries.insertHanziPinyin47);
        db.execSQL(InsertQueries.insertHanziPinyin48);
        db.execSQL(InsertQueries.insertHanziPinyin49);
        db.execSQL(InsertQueries.insertHanziPinyin50);
        db.execSQL(InsertQueries.insertHanziPinyin51);
        db.execSQL(InsertQueries.insertHanziPinyin52);
        db.execSQL(InsertQueries.insertHanziPinyin53);
        db.execSQL(InsertQueries.insertHanziPinyin54);
        db.execSQL(InsertQueries.insertHanziPinyin55);
        db.execSQL(InsertQueries.insertHanziPinyin56);

    }

    /**
     * onUpgrade
     *
     * @return void
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /**
         * on upgrade drop older tables
         * */
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HANZI);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PINYIN);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HANZI_PINYIN);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SOUND);

        /**
         * create new tables
         * */
        onCreate(db);
    }

    // ------------------------ "hanzis" table methods ----------------//

    /**
     * Creating a hanzi
     *
     * @param hanzi
     * @param pinyin_ids
     * @param wordInEnglish
     * @param wordInSpanish
     * @return long id
     */
    public long createHanzi(Hanzi hanzi, long[] pinyin_ids, String wordInEnglish, String wordInSpanish) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_CHARACTER_HANZI, hanzi.getCharacterHanzi());

        // insert row
        long hanzi_id = db.insert(TABLE_HANZI, null, values);

        // assigning pinyins to hanzi
        for (long pinyin_id : pinyin_ids) {
            createHanziPinyin(hanzi_id, pinyin_id, wordInEnglish, wordInSpanish);
        }

        return hanzi_id;
    }

    /**
     * get single hanzi
     *
     * @param hanzi_id
     * @return A Hanzi data type
     */
    public Hanzi getHanzi(long hanzi_id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + TABLE_HANZI + " WHERE "
                + KEY_HANZI_ID + " = " + hanzi_id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        Hanzi hanzi = new Hanzi();
        hanzi.setHanzi_id(c.getInt(c.getColumnIndex(KEY_HANZI_ID)));
        hanzi.setCharacterHanzi((c.getString(c.getColumnIndex(KEY_CHARACTER_HANZI))));

        return hanzi;
    }

    /**
     * get single hanzi
     *
     * @param pinyin_id
     * @return A String data type
     */
    public String getKeyCharacterHanzi(long pinyin_id) {
        SQLiteDatabase db = this.getReadableDatabase();

        // select th.* from hanzi th, hanzi_pinyin thp where th.hanzi_id = thp.hanzi_id and thp.pinyin_id = 39;
        String selectQuery = "SELECT th.* FROM " + TABLE_HANZI + " th, " + TABLE_HANZI_PINYIN + " thp WHERE thp."
                + KEY_PINYIN_ID + " = " + pinyin_id + " AND th." + KEY_HANZI_ID + " = thp." + KEY_HANZI_ID;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        String hanzi = c.getString(c.getColumnIndex(KEY_CHARACTER_HANZI));

        return hanzi;
    }

    /*
     * getting all hanzis
     * @return A String data type
     * */
    public List<Hanzi> getAllHanzis() {
        List<Hanzi> hanzis = new ArrayList<Hanzi>();
        String selectQuery = "SELECT  * FROM " + TABLE_HANZI;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Hanzi hanzi = new Hanzi();
                hanzi.setHanzi_id(c.getInt((c.getColumnIndex(KEY_HANZI_ID))));
                hanzi.setCharacterHanzi((c.getString(c.getColumnIndex(KEY_CHARACTER_HANZI))));

                // adding to hanzi list
                hanzis.add(hanzi);
            } while (c.moveToNext());
        }

        return hanzis;
    }

    /*
     * getting all hanzis under single pinyin
     * @param pinyin
     * @return A List of Hanzi
     * */
    public List<Hanzi> getAllHanzisByPinyin(String pinyin) {
        List<Hanzi> hanzis = new ArrayList<Hanzi>();

        String selectQuery = "SELECT  * FROM " + TABLE_HANZI + " th, "
                + TABLE_PINYIN + " tp, " + TABLE_HANZI_PINYIN + " thp WHERE tp."
                + KEY_PINYIN + " = '" + pinyin + "'" + " AND tp." + KEY_PINYIN_ID
                + " = " + "thp." + KEY_PINYIN_ID + " AND th." + KEY_HANZI_ID + " = "
                + "thp." + KEY_HANZI_ID;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Hanzi hanzi = new Hanzi();
                hanzi.setHanzi_id(c.getInt((c.getColumnIndex(KEY_HANZI_ID))));
                hanzi.setCharacterHanzi((c.getString(c.getColumnIndex(KEY_CHARACTER_HANZI))));

                // adding to hanzi list
                hanzis.add(hanzi);
            } while (c.moveToNext());
        }

        return hanzis;
    }

    /**
     * getting hanzi count
     *
     * @return int Counting Hanzi
     */
    public int getHanziCount() {
        String countQuery = "SELECT  * FROM " + TABLE_HANZI;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        int count = cursor.getCount();
        cursor.close();

        // return count
        return count;
    }

    /**
     * Updating a hanzi
     *
     * @param hanzi
     * @return void
     */
    public void updateHanzi(Hanzi hanzi) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_CHARACTER_HANZI, hanzi.getCharacterHanzi());

        // updating row
        db.update(TABLE_HANZI, values, KEY_HANZI_ID + " = ?",
                new String[]{String.valueOf(hanzi.getHanzi_id())});
    }

    /**
     * Deleting a hanzi
     *
     * @param hanzi_id
     * @return void
     */
    public void deleteHanzi(long hanzi_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_HANZI, KEY_HANZI_ID + " = ?",
                new String[]{String.valueOf(hanzi_id)});
    }

    // ------------------------ "pinyins" table methods ----------------//

    /**
     * Creating pinyin
     *
     * @param pinyin
     * @return long id
     */
    public long createPinyin(Pinyin pinyin) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_PINYIN, pinyin.getPinyin());
        values.put(KEY_TONE, pinyin.getTone());

        // insert row
        long pinyin_id = db.insert(TABLE_PINYIN, null, values);

        return pinyin_id;
    }

    /**
     * Get Pinyin String
     *
     * @param id
     * @return String pinyin
     */
    public String getKeyPinyin(long id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + TABLE_PINYIN + " WHERE "
                + KEY_PINYIN_ID + " = " + id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        return c.getString(c.getColumnIndex(KEY_PINYIN));
    }

    /**
     * Get Pinyin String
     *
     * @param id
     * @return String pinyin
     */
    public String getPinyin(long id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + TABLE_PINYIN + " WHERE "
                + KEY_PINYIN_ID + " = " + id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        return c.getString(c.getColumnIndex(KEY_PINYIN));
    }

    /**
     * Get Tone String
     *
     * @param id
     * @return String tone
     */
    public String getKeyTone(long id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + TABLE_PINYIN + " WHERE "
                + KEY_PINYIN_ID + " = " + id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        return c.getString(c.getColumnIndex(KEY_TONE));
    }

    /**
     * getting all pinyins
     *
     * @return List of Pinyin
     */
    public List<Pinyin> getAllPinyins() {
        List<Pinyin> pinyins = new ArrayList<Pinyin>();
        String selectQuery = "SELECT  * FROM " + TABLE_PINYIN;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Pinyin pinyin = new Pinyin();
                pinyin.setPinyin_id(c.getInt((c.getColumnIndex(KEY_PINYIN_ID))));
                pinyin.setPinyin(c.getString(c.getColumnIndex(KEY_PINYIN)));
                pinyin.setTone(c.getInt(c.getColumnIndex(KEY_TONE)));

                // adding to pinyins list
                pinyins.add(pinyin);
            } while (c.moveToNext());
        }
        return pinyins;
    }

    /**
     * Updating a pinyin
     *
     * @param pinyin
     */
    public int updatePinyin(Pinyin pinyin) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_PINYIN, pinyin.getPinyin());
        values.put(KEY_TONE, pinyin.getTone());
        values.put(KEY_SOUND_ID, pinyin.getSound_id());

        // updating row
        return db.update(TABLE_PINYIN, values, KEY_PINYIN_ID + " = ?",
                new String[]{String.valueOf(pinyin.getPinyin_id())});
    }

    /**
     * Deleting a pinyin
     *
     * @param pinyin
     * @param should_delete_all_pinyin_hanzis
     */
    public void deletePinyin(Pinyin pinyin, boolean should_delete_all_pinyin_hanzis) {
        SQLiteDatabase db = this.getWritableDatabase();

        // before deleting pinyin
        // check if hanzis under this pinyin should also be deleted
        if (should_delete_all_pinyin_hanzis) {
            // get all hanzis under this pinyin
            List<Hanzi> allPinyinHanzis = getAllHanzisByPinyin(pinyin.getPinyin());

            // delete all hanzis
            for (Hanzi hanzi : allPinyinHanzis) {
                // delete hanzi
                deleteHanzi(hanzi.getHanzi_id());
            }
        }

        // now delete the pinyin
        db.delete(TABLE_PINYIN, KEY_PINYIN_ID + " = ?",
                new String[]{String.valueOf(pinyin.getPinyin_id())});
    }

    // ------------------------ "hanzi_pinyins" table methods ----------------//

    /**
     * Creating hanzi_pinyin
     *
     * @param hanzi_id
     * @param pinyin_id
     * @param wordInEnglish
     * @param wordInSpanish
     * @return long id
     */
    public long createHanziPinyin(long hanzi_id, long pinyin_id, String wordInEnglish, String wordInSpanish) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_HANZI_ID, hanzi_id);
        values.put(KEY_PINYIN_ID, pinyin_id);
        values.put(KEY_WORD_IN_ENGLISH, wordInEnglish);
        values.put(KEY_WORD_IN_SPANISH, wordInSpanish);

        long id = db.insert(TABLE_HANZI_PINYIN, null, values);

        return id;
    }

    /**
     * Updating a hanzi pinyin
     *
     * @param id
     * @param pinyin_id
     * @return A int data type
     */
    public int updateNotePinyin(long id, long pinyin_id) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_PINYIN_ID, pinyin_id);

        // updating row
        return db.update(TABLE_HANZI, values, KEY_HANZI_ID + " = ?",
                new String[]{String.valueOf(id)});
    }

    /**
     * Get English Word String
     *
     * @param id
     * @return String EnglishWord
     */
    public String getKeyWordInEnglish(long id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + TABLE_HANZI_PINYIN + " WHERE "
                + KEY_PINYIN_ID + " = " + id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        return (c.getString(c.getColumnIndex(KEY_WORD_IN_ENGLISH)));
    }

    /**
     * Get Spanish Word String
     *
     * @param id
     * @return String SpanishWord
     */
    public String getKeyWordInSpanish(long id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + TABLE_HANZI_PINYIN + " WHERE "
                + KEY_PINYIN_ID + " = " + id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        return (c.getString(c.getColumnIndex(KEY_WORD_IN_SPANISH)));
    }

    /**
     * Deleting a hanzi pinyin
     *
     * @param id
     */
    public void deleteHanziPinyin(long id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_HANZI, KEY_HANZI_ID + " = ?",
                new String[]{String.valueOf(id)});
    }

    // ------------------------ "sounds" table methods ----------------//

    /**
     * Creating sound
     *
     * @param sound
     * @return id
     */
    public long createSound(Sound sound) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_URL_SOUND, sound.getUrl_sound());
        values.put(KEY_PINYIN_ID, sound.getPinyin_id());

        // insert row
        long sound_id = db.insert(TABLE_SOUND, null, values);

        return sound_id;
    }

    /**
     * getting all sounds
     *
     * @return List of Sound
     */
    public List<Sound> getAllSounds() {
        List<Sound> sounds = new ArrayList<Sound>();
        String selectQuery = "SELECT  * FROM " + TABLE_SOUND;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Sound sound = new Sound();
                sound.setSound_id(c.getInt((c.getColumnIndex(KEY_SOUND_ID))));
                sound.setUrl_sound(c.getString((c.getColumnIndex(KEY_URL_SOUND))));
                sound.setPinyin_id(c.getInt((c.getColumnIndex(KEY_PINYIN_ID))));

                // adding to sounds list
                sounds.add(sound);
            } while (c.moveToNext());
        }
        return sounds;
    }

    /**
     * Get url of sound file String
     *
     * @param id
     * @return String urlSound
     */
    public String getKeyUrlSound(long id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + TABLE_SOUND + " WHERE "
                + KEY_SOUND_ID + " = " + id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        return (c.getString(c.getColumnIndex(KEY_URL_SOUND)));
    }

    /**
     * Updating a sound
     *
     * @param sound
     * @return A int data type
     */
    public int updateSound(Sound sound) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_URL_SOUND, sound.getUrl_sound());
        values.put(KEY_PINYIN_ID, sound.getPinyin_id());

        // updating row
        return db.update(TABLE_SOUND, values, KEY_SOUND_ID + " = ?",
                new String[]{String.valueOf(sound.getSound_id())});
    }

    /**
     * Deleting a sound
     *
     * @param sound_id
     */
    public void deleteSound(long sound_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_SOUND, KEY_SOUND_ID + " = ?",
                new String[]{String.valueOf(sound_id)});
    }

    /**
     * closing database
     */
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }


}
