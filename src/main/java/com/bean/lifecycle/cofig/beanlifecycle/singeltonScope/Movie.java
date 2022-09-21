package com.bean.lifecycle.cofig.beanlifecycle.singeltonScope;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {

    private static int instances;

    private int id;
    private String fname;
    private String genre;
    private String director;

    public Movie(){
        super();
        instances++;

        System.out.println("Movie Constructor Called");

    }

    public static int getInstances(){
        return instances;

    }

    public double movieSimilarity(int movie, int movie2){
        double similarity = 0.0;

        return similarity;
    }
}
