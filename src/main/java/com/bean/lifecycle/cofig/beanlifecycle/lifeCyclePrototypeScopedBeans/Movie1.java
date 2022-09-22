package com.bean.lifecycle.cofig.beanlifecycle.lifeCyclePrototypeScopedBeans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie1 {
    private int id;
    private String fname;
    private String genre;
    private String director;

    public Movie1(){
        super();
        System.out.println("In Movie Constructor Method");
    }

    @PostConstruct
    private void checkPostConstruct(){
        System.out.println("In Movie Post Constructor Method");
    }


    @PreDestroy
    private void checkPreDestroy(){
        System.out.println("In Movie Pre Destroy Method");
    }

    public double movieSimilarity(int movie, int movie2){
        double similarity = 0.0;

        return similarity;
    }

}
