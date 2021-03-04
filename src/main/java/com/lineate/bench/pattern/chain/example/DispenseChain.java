package com.lineate.bench.pattern.chain.example;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
