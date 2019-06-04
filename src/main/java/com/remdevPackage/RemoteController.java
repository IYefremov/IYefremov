package com.remdevPackage;

public class RemoteController  implements Device, Volume {

    private TVDevice tvDevice;

    public TVDevice getTvDevice() {
        return tvDevice;
    }

    public void setTvDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
    }


    public void powerOn(){
        this.tvDevice.setIsOn(true);
        System.out.println("RemoteController powerOn method");
    }


    public void powerOff(){
        this.tvDevice.setIsOn(false);
        System.out.println("RemoteController power off method");
    }

    public void setChannel(int channel){
        this.tvDevice.setChannel(channel);
        System.out.println("RemoteController setChannel method");
    }

    public void currentChannel(){
        this.tvDevice.currentChannel();
        System.out.println("RemoteController Current channel method");
    }

    public void upVolume(){
        this.tvDevice.upVolume();
        System.out.println("RemoteController upVolume method");
    }

    public void downVolume(){
        this.tvDevice.downVolume();
        System.out.println("RemoteController downVolume method");
    }
    public void mute(){
        this.tvDevice.mute();
        System.out.println("RemoteController mute method");
    }

    public void connectDevice(TVDevice tvDevice){
        this.tvDevice.setIsConnect(true);
        System.out.println("RemoteController connectDevice method");
    }

    public void disconnectDevice(){
        this.tvDevice.setIsConnect(false);
        System.out.println("RemoteController disconnectDevice method");
    }

    public void switchTheChannel (int channel){
        this.tvDevice.setChannel(channel);
        System.out.println("RemoteController switchTheChannel method");
    }

    public boolean checkIfDeviceConnected (){
        if (this.tvDevice.getIsConnect()) return true;
        else return false;
    }
}

