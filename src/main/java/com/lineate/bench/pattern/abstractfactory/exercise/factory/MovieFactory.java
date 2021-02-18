package com.lineate.bench.pattern.abstractfactory.exercise.factory;

import com.lineate.bench.pattern.abstractfactory.exercise.product.BollywoodMovie;
import com.lineate.bench.pattern.abstractfactory.exercise.product.HollywoodMovie;

public interface MovieFactory {
    HollywoodMovie getHollywoodMovie();

    BollywoodMovie getBollywoodMovie();
}
