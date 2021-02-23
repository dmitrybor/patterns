package com.lineate.bench.pattern.adapter.example.birds;

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says ...");
        testDuck(duck);

        System.out.println("\nThe turkey adapter says ...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
