package com.example.lenovo.beatbox;

/**
 * Created by Lenovo on 2018/4/10.
 */

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath){
        mAssetPath=assetPath;
        String[]components=assetPath.split("/");
        String filename=components[components.length-1];
        mName=filename.replace(".wav","");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

}
