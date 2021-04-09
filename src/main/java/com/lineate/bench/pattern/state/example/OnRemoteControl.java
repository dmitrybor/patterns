package com.lineate.bench.pattern.state.example;

public class OnRemoteControl extends RemoteControl{
    @Override
    public void pressSwitch(TvContext context) {
        System.out.println("I am already On. Going to be Off now.");
        context.setState(new OffRemoteControl());
    }
}
