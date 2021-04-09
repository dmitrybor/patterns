package com.lineate.bench.pattern.state.example;

public class OffRemoteControl extends RemoteControl{
    @Override
    public void pressSwitch(TvContext context) {
        System.out.println("I am Off. Going to be On now.");
        context.setState(new OnRemoteControl());
    }
}
