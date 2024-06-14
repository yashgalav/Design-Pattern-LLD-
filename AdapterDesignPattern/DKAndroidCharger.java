package main.designPattern.AdapterDesignPattern;

public class DKAndroidCharger implements AndroidCharger{
    @Override
    public void chargeAndroid() {
        System.out.println("Charge from android");
    }
}
