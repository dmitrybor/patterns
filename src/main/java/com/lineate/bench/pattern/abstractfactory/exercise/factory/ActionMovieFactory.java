package com.lineate.bench.pattern.abstractfactory.exercise.factory;

import com.lineate.bench.pattern.abstractfactory.exercise.product.BollywoodActionMovie;
import com.lineate.bench.pattern.abstractfactory.exercise.product.BollywoodMovie;
import com.lineate.bench.pattern.abstractfactory.exercise.product.HollywoodActionMovie;
import com.lineate.bench.pattern.abstractfactory.exercise.product.HollywoodMovie;

public class ActionMovieFactory implements MovieFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
