package com.lineate.bench.pattern.state.example;

public class TvContext {
    private RemoteControl state;

    public TvContext(RemoteControl state) {
        this.state = state;
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressSwitch(this);
    }
}
