package com.company;

interface MyCamera {
    void takeSnap();
    void recordVideo();
    default void openCamera() {
        System.out.println("Opening Camera");
    }
    default void recordVideoIn4k() {
        openCamera();
        System.out.println("Recording in 4k");
    }
}

interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void call(int num) {
        System.out.println("Calling on the number " + num);
    }
    void receiveCall() {
        System.out.println("Receiving a call...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {

    @Override
    public void takeSnap() {
        System.out.println("Taking a snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public String[] getNetworks() {
        String[] networks = {"networkA", "networkB", "networkC"};
        return networks;
    }

    @Override
    public void openCamera() {
        System.out.println("Camera opened.");
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to network " + network);
    }
}
public class cwh_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone mySmartPhone = new MySmartPhone();
        mySmartPhone.recordVideoIn4k();
        String[] networks = mySmartPhone.getNetworks();
        for(String network: networks) {
            System.out.println(network);
        }
    }
}
