package com.lineate.bench.pattern.observer.exercise;

public class Client {
    public static void main(String[] args) {
        CricketData cricketData =new CricketData();
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
        cricketData.register(currentScoreDisplay);
        cricketData.register(averageScoreDisplay);

        cricketData.dataChanged(90, 2, 10);
        cricketData.unregister(averageScoreDisplay);
        cricketData.dataChanged(90, 2, 10);
    }
}
