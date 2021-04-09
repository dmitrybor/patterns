package com.lineate.bench.pattern.state.example;

public class Client {
    public static void main(String[] args) {
        OffRemoteControl initialState = new OffRemoteControl();
        TvContext tv = new TvContext(initialState);
        tv.pressButton();
        tv.pressButton();
    }
}
