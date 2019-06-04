package com.remdevPackage;

public class TV extends TVDevice {


    private int volumeLevel;
    private int channelNumber;

    public int getVolumeLevel() {
        return this.volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void setModelName(String modelName){
        super.setModelName(modelName);
    }

    public String getModelName(){
        return super.getModelName();
    }

    public void powerOn(){
        System.out.println("TV powerOn method");
        setIsOn(true);
    }

    public void powerOff(){
        System.out.println("TV power off method");
        setIsOn(false);
    }

    public void setChannel(int channel){
        this.channelNumber = channel;
        System.out.println("TV setChannel method. Channel is " + this.channelNumber );
    }

    public void currentChannel(){
        System.out.println("TV Current channel method. Current channel is " + this.channelNumber);
    }

    public void upVolume(){
        this.volumeLevel++;
        System.out.println("TV upVolume method. Volume is " + this.volumeLevel);
    }

    public void downVolume(){
        if(this.volumeLevel != 0) this.volumeLevel--;
        System.out.println("TV downVolume method. Volume is " + this.volumeLevel);
    }
    public void mute(){
        this.volumeLevel = 0;
        System.out.println("TV mute method. Volume is " + this.volumeLevel);
    }


    public boolean  getIsOn() {
        return super.getIsOn();
    }


    public void setIsOn(boolean on){
       super.setIsOn(on);
    }

    public void setIsConnect (boolean conn){
        super.setIsConnect(conn);
    }

    public boolean getIsConnect (){
        return super.getIsConnect();
    }

}
