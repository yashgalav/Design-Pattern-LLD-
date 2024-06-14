package main.designPattern.AdapterDesignPattern;

public class ChargerXyz implements AppleCharger {
    @Override
    public void chargePhone() {
        System.out.println("iphone is charge through xyz");
    }
}
