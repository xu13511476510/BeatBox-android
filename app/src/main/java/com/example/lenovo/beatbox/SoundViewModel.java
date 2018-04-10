package com.example.lenovo.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Lenovo on 2018/4/10.
 */

public class SoundViewModel extends BaseObservable {
    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox=beatBox;
    }
    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
