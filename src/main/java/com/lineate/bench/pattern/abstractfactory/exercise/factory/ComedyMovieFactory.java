package com.lineate.bench.pattern.abstractfactory.exercise.factory;

import com.lineate.bench.pattern.abstractfactory.exercise.product.BollywoodComedyMovie;
import com.lineate.bench.pattern.abstractfactory.exercise.product.BollywoodMovie;
import com.lineate.bench.pattern.abstractfactory.exercise.product.HollywoodComedyMovie;
import com.lineate.bench.pattern.abstractfactory.exercise.product.HollywoodMovie;

public class ComedyMovieFactory implements MovieFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }


    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
