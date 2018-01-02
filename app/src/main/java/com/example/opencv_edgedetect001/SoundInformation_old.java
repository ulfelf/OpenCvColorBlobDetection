package com.example.opencv_edgedetect001;

import android.content.Context;
import android.media.SoundPool;

/**
 * Created by blandfars on 2017-12-29.
 */

//Contains all sorts of things needed to store sound names, soundPool, resourceIDs for sounds and etc.
public class SoundInformation_old {
    private int priority;
    private SoundPool soundPool;
    private int[] resourceID;
    private int[] soundPoolID;
    private String[] resourceName;


    public SoundInformation_old(int priority, SoundPool soundPool){
        this.priority = priority;
        this.soundPool = soundPool;
        resourceID = new int[0];
        soundPoolID = new int[0];
        resourceName = new String[0];
    }


    public void setPriority(int prio){this.priority = prio;}
    public int getPriority(){return this.priority;}
    public SoundPool getSoundPool(){return this.soundPool;}


    public void add(int resId, int soundId, String soundName){
        if(soundName==null){
            soundName = "";
        }
        int[] tempResId = resourceID.clone();
        int[] tempSoundId = soundPoolID.clone();
        String[] tempStr = resourceName.clone();
        resourceID = new int[tempResId.length+1];
        soundPoolID = new int[tempResId.length+1];
        resourceName = new String[tempResId.length+1];
        for(int i=0;i<tempResId.length;i++){
            resourceID[i] = tempResId[i];
            soundPoolID[i] = tempSoundId[i];
            resourceName[i] = tempStr[i];
        }
        resourceID[tempResId.length] = resId;
        soundPoolID[tempResId.length] = soundId;
        resourceName[tempResId.length] = soundName;
    }

    public int length(){
        return resourceID.length;
    }

    public int getResouceID(int index){return this.resourceID[index];}
    public int getSoundPoolId(int index){return this.soundPoolID[index];}
    public String getResouceName(int index){return this.resourceName[index];}
    public boolean setSoundPoolId(int index, int soundID){
        if(this.soundPoolID.length>index){
            this.soundPoolID[index] = soundID;
            return  true;
        }else{
            return false;
        }
    }








}
