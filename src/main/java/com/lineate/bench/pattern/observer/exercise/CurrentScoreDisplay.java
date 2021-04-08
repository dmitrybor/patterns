package com.lineate.bench.pattern.observer.exercise;

public class CurrentScoreDisplay implements Observer{
    @Override
    public void update(int runs, int wickets, int overs) {
        System.out.println("Current Score Display:");
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
        System.out.println("Overs: " + overs);
        System.out.println();
    }
}
