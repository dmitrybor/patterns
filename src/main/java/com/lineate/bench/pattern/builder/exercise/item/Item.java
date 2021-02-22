package com.lineate.bench.pattern.builder.exercise.item;

import com.lineate.bench.pattern.builder.exercise.packing.Packing;

public interface Item {

    String getName();

    float getPrice();

    Packing getPacking();

    void setPacking(Packing packing);
}
