package main.designPattern.AdapterDesignPattern;

public class AdpaterCharger implements AppleCharger{

    private AndroidCharger charger;

    public AdpaterCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargeAndroid();
    }
}
