package com.lineate.bench.pattern.builder.exercise.item;

import com.lineate.bench.pattern.builder.exercise.packing.Packing;

public abstract class Burger implements Item {
    private Packing packing;

    @Override
    public Packing getPacking() {
        return packing;
    }

    @Override
    public void setPacking(Packing packing) {
        this.packing = packing;
    }
}
