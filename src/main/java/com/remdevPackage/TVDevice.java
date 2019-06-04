package com.remdevPackage;

public abstract class TVDevice implements Device, Volume {

    private String modelName;
    private boolean isOn;
    private boolean isConnect;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean getIsOn()
    {
        return this.isOn;
    }

    public  void setIsOn(boolean on)
    {
        this.isOn = on;
    }


    public boolean getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(boolean connect) {
        isConnect = connect;
    }
}
