package com.lineate.bench.pattern.abstractfactory.exercise;

import com.lineate.bench.pattern.abstractfactory.exercise.factory.MovieFactory;
import com.lineate.bench.pattern.abstractfactory.exercise.factory.MovieFactoryProducer;
import com.lineate.bench.pattern.abstractfactory.exercise.product.BollywoodMovie;
import com.lineate.bench.pattern.abstractfactory.exercise.product.HollywoodMovie;

public class Client {
    public static void main(String[] args) {
        MovieFactory comedyMovieFactory = MovieFactoryProducer.getMovieFactory("comedy");
        MovieFactory actionMovieFactory = MovieFactoryProducer.getMovieFactory("action");

        System.out.println("Comedy movies");
        HollywoodMovie hollywoodComedyMovie = comedyMovieFactory.getHollywoodMovie();
        hollywoodComedyMovie.showName();
        BollywoodMovie bollywoodComedyMovie = comedyMovieFactory.getBollywoodMovie();
        bollywoodComedyMovie.showName();
        System.out.println("Action movies");
        HollywoodMovie hollywoodActionMovie = actionMovieFactory.getHollywoodMovie();
        hollywoodActionMovie.showName();
        BollywoodMovie bollywoodActionMovie = actionMovieFactory.getBollywoodMovie();
        bollywoodActionMovie.showName();
    }
}
