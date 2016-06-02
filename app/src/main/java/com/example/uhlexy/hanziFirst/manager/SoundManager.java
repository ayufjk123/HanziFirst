package com.example.uhlexy.hanziFirst.manager;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.SparseArray;

import com.example.uhlexy.hanziFirst.R;

/**
 * Created by Yincong on 19/05/2016.
 */
public class SoundManager {

    public static int SOUNDPOOLSND_SHU4 = 0;
    public static int SOUNDPOOLSND_SHU3 = 1;
    public static int SOUNDPOOLSND_HAN4 = 2;
    public static int SOUNDPOOLSND_WANG4 = 3;
    public static int SOUNDPOOLSND_ZAI4 = 4;
    public static int SOUNDPOOLSND_ZHEN1 = 5;
    public static int SOUNDPOOLSND_ZI3 = 6;
    public static int SOUNDPOOLSND_ZI5 = 7;
    public static int SOUNDPOOLSND_JIA1 = 8;
    public static int SOUNDPOOLSND_NE5 = 9;
    public static int SOUNDPOOLSND_JIN1 = 10;
    public static int SOUNDPOOLSND_CI2 = 11;
    public static int SOUNDPOOLSND_QUAN2 = 12;
    public static int SOUNDPOOLSND_ZU3 = 13;
    public static int SOUNDPOOLSND_SHI4 = 14;
    public static int SOUNDPOOLSND_SHANG4 = 15;
    public static int SOUNDPOOLSND_PENG2 = 16;
    public static int SOUNDPOOLSND_QIU2 = 17;
    public static int SOUNDPOOLSND_HE2 = 18;
    public static int SOUNDPOOLSND_MEI4 = 19;
    public static int SOUNDPOOLSND_ZHI1 = 20;
    public static int SOUNDPOOLSND_QU4 = 21;
    public static int SOUNDPOOLSND_TI2 = 22;
    public static int SOUNDPOOLSND_MIAN4 = 23;
    public static int SOUNDPOOLSND_XIAN1 = 24;
    public static int SOUNDPOOLSND_DANG1 = 25;
    public static int SOUNDPOOLSND_DANG4 = 26;
    public static int SOUNDPOOLSND_JIAO1JIAO4 = 27;
    public static int SOUNDPOOLSND_JIAO4 = 28;
    public static int SOUNDPOOLSND_CHANG2 = 29;
    public static int SOUNDPOOLSND_ZHANG3 = 30;
    public static int SOUNDPOOLSND_DA1 = 31;
    public static int SOUNDPOOLSND_DA2 = 32;
    public static int SOUNDPOOLSND_YUAN2 = 33;
    public static int SOUNDPOOLSND_TU3 = 34;
    public static int SOUNDPOOLSND_XU3 = 35;
    public static int SOUNDPOOLSND_BU4 = 36;
    public static int SOUNDPOOLSND_HAO4 = 37;
    public static int SOUNDPOOLSND_SI1 = 38;
    public static int SOUNDPOOLSND_QI2 = 39;
    public static int SOUNDPOOLSND_ZHI4 = 40;
    public static int SOUNDPOOLSND_FU4 = 41;
    public static int SOUNDPOOLSND_QI1 = 42;
    public static int SOUNDPOOLSND_FA3 = 43;
    public static int SOUNDPOOLSND_YI3 = 44;
    public static int SOUNDPOOLSND_LUN4 = 45;
    public static int SOUNDPOOLSND_SHOU3 = 46;
    public static int SOUNDPOOLSND_AI4 = 47;
    public static int SOUNDPOOLSND_ZUO4 = 48;
    public static int SOUNDPOOLSND_JIAO1 = 49;
    public static int SOUNDPOOLSND_QI4 = 50;
    public static int SOUNDPOOLSND_GU3 = 51;
    public static int SOUNDPOOLSND_HOU2 = 52;
    public static int SOUNDPOOLSND_REN4 = 53;
    public static int SOUNDPOOLSND_DU2 = 54;
    public static int SOUNDPOOLSND_KAO3 = 55;

    public static boolean isSoundTurnedOff;

    private static SoundManager mSoundManager;

    private SoundPool mSoundPool;
    private SparseArray<Integer> mSoundPoolMap;
    private AudioManager mAudioManager;

    public static final int maxSounds = 4;

    public static SoundManager getInstance(Context context) {
        if (mSoundManager == null) {
            mSoundManager = new SoundManager(context);
        }

        return mSoundManager;
    }

    public SoundManager(Context mContext) {
        mAudioManager = (AudioManager) mContext
                .getSystemService(Context.AUDIO_SERVICE);
        mSoundPool = new SoundPool(maxSounds, AudioManager.STREAM_MUSIC, 0);

        mSoundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                                       int status) {
                boolean loaded = true;
            }
        });

        mSoundPoolMap = new SparseArray<Integer>();
        mSoundPoolMap.put(SOUNDPOOLSND_SHU4,
                mSoundPool.load(mContext, R.raw.shu4_1, 0));
        mSoundPoolMap.put(SOUNDPOOLSND_SHU3,
                mSoundPool.load(mContext, R.raw.shu3_2, 1));
        mSoundPoolMap.put(SOUNDPOOLSND_HAN4,
                mSoundPool.load(mContext, R.raw.han4_3, 2));
        mSoundPoolMap.put(SOUNDPOOLSND_WANG4,
                mSoundPool.load(mContext, R.raw.wang4_4, 3));
        mSoundPoolMap.put(SOUNDPOOLSND_ZAI4,
                mSoundPool.load(mContext, R.raw.zai4_5, 4));
        mSoundPoolMap.put(SOUNDPOOLSND_ZHEN1,
                mSoundPool.load(mContext, R.raw.zhen1_6, 5));
        mSoundPoolMap.put(SOUNDPOOLSND_ZI3,
                mSoundPool.load(mContext, R.raw.zi3_7, 6));
        mSoundPoolMap.put(SOUNDPOOLSND_ZI5,
                mSoundPool.load(mContext, R.raw.zi5_8, 7));
        mSoundPoolMap.put(SOUNDPOOLSND_JIA1,
                mSoundPool.load(mContext, R.raw.jia1_9, 8));
        mSoundPoolMap.put(SOUNDPOOLSND_NE5,
                mSoundPool.load(mContext, R.raw.ne5_10, 9));
        mSoundPoolMap.put(SOUNDPOOLSND_JIN1,
                mSoundPool.load(mContext, R.raw.jin1_11, 10));
        mSoundPoolMap.put(SOUNDPOOLSND_CI2,
                mSoundPool.load(mContext, R.raw.ci2_12, 11));
        mSoundPoolMap.put(SOUNDPOOLSND_QUAN2,
                mSoundPool.load(mContext, R.raw.quan2_13, 12));
        mSoundPoolMap.put(SOUNDPOOLSND_ZU3,
                mSoundPool.load(mContext, R.raw.zu3_14, 13));
        mSoundPoolMap.put(SOUNDPOOLSND_SHI4,
                mSoundPool.load(mContext, R.raw.shi4_15, 14));
        mSoundPoolMap.put(SOUNDPOOLSND_SHANG4,
                mSoundPool.load(mContext, R.raw.shang4_16, 15));
        mSoundPoolMap.put(SOUNDPOOLSND_PENG2,
                mSoundPool.load(mContext, R.raw.peng2_17, 16));
        mSoundPoolMap.put(SOUNDPOOLSND_QIU2,
                mSoundPool.load(mContext, R.raw.qiu2_18, 17));
        mSoundPoolMap.put(SOUNDPOOLSND_HE2,
                mSoundPool.load(mContext, R.raw.he2_19, 18));
        mSoundPoolMap.put(SOUNDPOOLSND_MEI4,
                mSoundPool.load(mContext, R.raw.mei4_20, 19));
        mSoundPoolMap.put(SOUNDPOOLSND_ZHI1,
                mSoundPool.load(mContext, R.raw.zhi1_21, 20));
        mSoundPoolMap.put(SOUNDPOOLSND_QU4,
                mSoundPool.load(mContext, R.raw.qu4_22, 21));
        mSoundPoolMap.put(SOUNDPOOLSND_TI2,
                mSoundPool.load(mContext, R.raw.ti2_23, 22));
        mSoundPoolMap.put(SOUNDPOOLSND_MIAN4,
                mSoundPool.load(mContext, R.raw.mian4_24, 23));
        mSoundPoolMap.put(SOUNDPOOLSND_XIAN1,
                mSoundPool.load(mContext, R.raw.xian1_25, 24));
        mSoundPoolMap.put(SOUNDPOOLSND_DANG1,
                mSoundPool.load(mContext, R.raw.dang1_26, 25));
        mSoundPoolMap.put(SOUNDPOOLSND_DANG4,
                mSoundPool.load(mContext, R.raw.dang4_27, 26));
        mSoundPoolMap.put(SOUNDPOOLSND_JIAO1JIAO4,
                mSoundPool.load(mContext, R.raw.jiao1jiao4_28, 27));
        mSoundPoolMap.put(SOUNDPOOLSND_JIAO4,
                mSoundPool.load(mContext, R.raw.jiao4_29, 28));
        mSoundPoolMap.put(SOUNDPOOLSND_CHANG2,
                mSoundPool.load(mContext, R.raw.chang2_30, 29));
        mSoundPoolMap.put(SOUNDPOOLSND_ZHANG3,
                mSoundPool.load(mContext, R.raw.zhang3_31, 30));
        mSoundPoolMap.put(SOUNDPOOLSND_DA1,
                mSoundPool.load(mContext, R.raw.da1_32, 31));
        mSoundPoolMap.put(SOUNDPOOLSND_DA2,
                mSoundPool.load(mContext, R.raw.da2_33, 32));
        mSoundPoolMap.put(SOUNDPOOLSND_YUAN2,
                mSoundPool.load(mContext, R.raw.yuan2_34, 33));
        mSoundPoolMap.put(SOUNDPOOLSND_TU3,
                mSoundPool.load(mContext, R.raw.tu3_35, 34));
        mSoundPoolMap.put(SOUNDPOOLSND_XU3,
                mSoundPool.load(mContext, R.raw.xu3_36, 35));
        mSoundPoolMap.put(SOUNDPOOLSND_BU4,
                mSoundPool.load(mContext, R.raw.bu4_37, 36));
        mSoundPoolMap.put(SOUNDPOOLSND_HAO4,
                mSoundPool.load(mContext, R.raw.hao4_38, 37));
        mSoundPoolMap.put(SOUNDPOOLSND_SI1,
                mSoundPool.load(mContext, R.raw.si1_39, 38));
        mSoundPoolMap.put(SOUNDPOOLSND_QI2,
                mSoundPool.load(mContext, R.raw.qi2_40, 39));
        mSoundPoolMap.put(SOUNDPOOLSND_ZHI4,
                mSoundPool.load(mContext, R.raw.zhi4_41, 40));
        mSoundPoolMap.put(SOUNDPOOLSND_FU4,
                mSoundPool.load(mContext, R.raw.fu4_42, 41));
        mSoundPoolMap.put(SOUNDPOOLSND_QI1,
                mSoundPool.load(mContext, R.raw.qi1_43, 42));
        mSoundPoolMap.put(SOUNDPOOLSND_FA3,
                mSoundPool.load(mContext, R.raw.fa3_44, 43));
        mSoundPoolMap.put(SOUNDPOOLSND_YI3,
                mSoundPool.load(mContext, R.raw.yi3_45, 44));
        mSoundPoolMap.put(SOUNDPOOLSND_LUN4,
                mSoundPool.load(mContext, R.raw.lun4_46, 45));
        mSoundPoolMap.put(SOUNDPOOLSND_SHOU3,
                mSoundPool.load(mContext, R.raw.shou3_47, 46));
        mSoundPoolMap.put(SOUNDPOOLSND_AI4,
                mSoundPool.load(mContext, R.raw.ai4_48, 47));
        mSoundPoolMap.put(SOUNDPOOLSND_ZUO4,
                mSoundPool.load(mContext, R.raw.zuo4_49, 48));
        mSoundPoolMap.put(SOUNDPOOLSND_JIAO1,
                mSoundPool.load(mContext, R.raw.jiao1_50, 49));
        mSoundPoolMap.put(SOUNDPOOLSND_QI4,
                mSoundPool.load(mContext, R.raw.qi4_51, 50));
        mSoundPoolMap.put(SOUNDPOOLSND_GU3,
                mSoundPool.load(mContext, R.raw.gu3_52, 51));
        mSoundPoolMap.put(SOUNDPOOLSND_HOU2,
                mSoundPool.load(mContext, R.raw.hou4_53, 52));
        mSoundPoolMap.put(SOUNDPOOLSND_REN4,
                mSoundPool.load(mContext, R.raw.ren4_54, 53));
        mSoundPoolMap.put(SOUNDPOOLSND_DU2,
                mSoundPool.load(mContext, R.raw.du2_55, 54));
        mSoundPoolMap.put(SOUNDPOOLSND_KAO3,
                mSoundPool.load(mContext, R.raw.kao3_56, 55));

    }

    public void playSound(int index) {
        if (isSoundTurnedOff)
            return;

        int streamVolume = mAudioManager
                .getStreamVolume(AudioManager.STREAM_MUSIC);
        mSoundPool.play(mSoundPoolMap.get(index), streamVolume, streamVolume,
                1, 0, 1f);
    }

    public static void clear() {
        if (mSoundManager != null) {
            mSoundManager.mSoundPool = null;
            mSoundManager.mAudioManager = null;
            mSoundManager.mSoundPoolMap = null;
        }
        mSoundManager = null;
    }
}