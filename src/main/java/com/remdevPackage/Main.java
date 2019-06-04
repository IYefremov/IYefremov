package com.remdevPackage;

public class Main {

    public static void main(String[] args) {

        TV tvDevice = new TV();

        // устанавливаем марку телевизоро и віводим ее на печать
        tvDevice.setModelName("SONY");
        System.out.println("The TV name is " + tvDevice.getModelName());


        // включение/выключение телевизора
        tvDevice.powerOn();
        boolean work = tvDevice.getIsOn();
        System.out.println("Tv works - " + work);

        tvDevice.powerOff();
        work = tvDevice.getIsOn();
        System.out.println("Tv works - " + work);


        // работа со звуком
        tvDevice.setVolumeLevel(5);
        System.out.println("The volume is " + tvDevice.getVolumeLevel());
        tvDevice.downVolume();
        System.out.println("The volume is " + tvDevice.getVolumeLevel());
        tvDevice.downVolume();
        tvDevice.downVolume();
        tvDevice.downVolume();
        tvDevice.downVolume();
        tvDevice.downVolume();
        tvDevice.downVolume();
        tvDevice.upVolume();
        tvDevice.mute();

        // работа с каналами
        tvDevice.setChannel(1);
        tvDevice.currentChannel();


        // Remote Controller
        RemoteController remoteController = new RemoteController();
        remoteController.setTvDevice(tvDevice);

        // включаем телевизор через RemoteController
        remoteController.powerOn();
        work = tvDevice.getIsOn();
        System.out.println("Tv works - " + work); // если work == true - телевизор включен

        // выключаем телевизор через RemoteController
        remoteController.powerOff();
        work = tvDevice.getIsOn();
        System.out.println("Tv works - " + work); // если work == false - телевизор выключен

        // устанавливаем канал с RemoteController
        remoteController.setChannel(12);
        tvDevice.currentChannel(); // проверяем какой канал установлен на телевизоре
        remoteController.currentChannel();

        // увеличиваем звук с RemoteController
        remoteController.upVolume();
        // уменьшае звук с RemoteController
        remoteController.downVolume();
        // mute from RemoteController
        remoteController.mute();

        // устанавливаем канал с RemoteController
        remoteController.switchTheChannel(45
        );

        // подключаем пульт к телевизору
        remoteController.connectDevice(tvDevice);
        // проверяем есть ли связь пульта с телевизором
        if (tvDevice.getIsConnect()){
            System.out.println("Remote is connected to TV");
        } else System.out.println("Remote is not connected to TV");

        // отключаем пульт от телевизору
        remoteController.disconnectDevice();
        // проверяем есть ли связь пульта с телевизором
        if (tvDevice.getIsConnect()){
            System.out.println("Remote is connected to TV");
        } else System.out.println("Remote is not connected to TV");


        // еще один метод проверить или пульт подключен к телевизору
        if (remoteController.checkIfDeviceConnected()){
            System.out.println("Remote is connected to TV");
        } else System.out.println("Remote is not connected to TV");

    }
}
