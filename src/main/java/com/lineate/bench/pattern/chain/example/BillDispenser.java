package com.lineate.bench.pattern.chain.example;

import static java.util.Objects.nonNull;

public class BillDispenser implements DispenseChain {
    private DispenseChain nextChain;
    private final int billAmount;

    public BillDispenser(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        int billCount = amount / billAmount;
        if (billCount > 0) {
            System.out.println("Dispensing " + billCount + " " + billAmount + "$ note");
        } else if (nonNull(nextChain)) {
            nextChain.dispense(currency);
            return;
        }
        int remainder = amount % billAmount;
        if (remainder != 0 && nonNull(nextChain)) {
            nextChain.dispense(new Currency(remainder));
        }
    }
}
