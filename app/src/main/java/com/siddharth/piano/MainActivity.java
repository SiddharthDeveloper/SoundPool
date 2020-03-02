package com.siddharth.piano;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    //  Variables
    SoundPool mSoundPool;
    int soundId_A;
    int soundId_B;
    int soundId_C;
    int soundId_D;
    int soundId_E;
    int soundId_F;
    int soundId_G;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 	Updated way to create a SoundPool for API levels newer than Android Lollipop
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPool = new SoundPool.Builder()
                    .setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS)
                    .build();
        } else {
            // Deprecated way of creating a SoundPool before Android API 21.
            mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        }

        // Get the resource IDs to identify the sounds and store them in variables
        soundId_A = mSoundPool.load(getApplicationContext(), R.raw.sound1, 1);
        soundId_B = mSoundPool.load(getApplicationContext(), R.raw.sound2, 1);
        soundId_C = mSoundPool.load(getApplicationContext(), R.raw.sound3, 1);
        soundId_D = mSoundPool.load(getApplicationContext(), R.raw.sound4, 1);
        soundId_E = mSoundPool.load(getApplicationContext(), R.raw.sound5, 1);
        soundId_F = mSoundPool.load(getApplicationContext(), R.raw.sound6, 1);
        soundId_G = mSoundPool.load(getApplicationContext(), R.raw.sound7, 1);

    }

    // Individual methods linked to onClick properties in the XML layout file

    public void soundA(View v) {
        mSoundPool.play(soundId_A, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void soundB(View v) {
        mSoundPool.play(soundId_B, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void soundC(View v) {
        mSoundPool.play(soundId_C, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void soundD(View v) {
        mSoundPool.play(soundId_D, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void soundE(View v) {
        mSoundPool.play(soundId_E, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void soundF(View v) {
        mSoundPool.play(soundId_F, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void soundG(View v) {
        mSoundPool.play(soundId_G, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

}
