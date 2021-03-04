package com.lineate.bench.pattern.chain.example;

import java.util.Scanner;

public class Client {
    private DispenseChain chain;

    public Client() {
        DispenseChain fiftyDispenser = new BillDispenser(50);
        DispenseChain twentyDispenser = new BillDispenser(20);
        DispenseChain tenDispenser = new BillDispenser(10);
        twentyDispenser.setNextChain(tenDispenser);
        fiftyDispenser.setNextChain(twentyDispenser);
        this.chain = fiftyDispenser;
    }

    public static void main(String[] args) {
        Client atmDispenser = new Client();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            atmDispenser.chain.dispense(new Currency(amount));
        }
    }
}
