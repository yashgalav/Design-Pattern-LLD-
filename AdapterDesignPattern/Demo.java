package main.designPattern.AdapterDesignPattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("program started");

//        AppleCharger charger = new ChargerXyz();

        AdpaterCharger adpaterCharger = new AdpaterCharger(new DKAndroidCharger());

        Iphone iphone= new Iphone(adpaterCharger);
        iphone.chargeIphone();

    }
}
