package com.lineate.bench.pattern.observer.exercise;

public class AverageScoreDisplay implements Observer {
    @Override
    public void update(int runs, int wickets, int overs) {
        float runRate = overs != 0 ? (float) runs / (float) overs : 0.0F;
        float predictedScore = runRate * 50;
        System.out.println("Average Score Display:");
        System.out.println("Run Rate: " + runRate);
        System.out.println("Predicted Score: " + predictedScore);
        System.out.println();
    }
}
