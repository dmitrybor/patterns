package com.lineate.bench.pattern.state.exercise;

public class Client {
    public static void main(String[] args) {
        SilentModeState silentMode = new SilentModeState();
        VibrationModeState vibrationMode = new VibrationModeState();

        MobilePhoneContext mobilePhone = new MobilePhoneContext(vibrationMode);
        mobilePhone.alert();
        mobilePhone.alert();
        mobilePhone.setAlertModeState(silentMode);
        mobilePhone.alert();
        mobilePhone.alert();
        mobilePhone.setAlertModeState(vibrationMode);
        mobilePhone.alert();
        mobilePhone.alert();
    }
}
