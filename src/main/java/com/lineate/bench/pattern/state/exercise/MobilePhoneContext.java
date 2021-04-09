package com.lineate.bench.pattern.state.exercise;

public class MobilePhoneContext {
    private AlertModeState alertModeState;

    public MobilePhoneContext(AlertModeState alertModeState) {
        this.alertModeState = alertModeState;
    }

    public AlertModeState getAlertModeState() {
        return alertModeState;
    }

    public void setAlertModeState(AlertModeState alertModeState) {
        this.alertModeState = alertModeState;
    }

    public void alert() {
        alertModeState.alert();
    }
}
