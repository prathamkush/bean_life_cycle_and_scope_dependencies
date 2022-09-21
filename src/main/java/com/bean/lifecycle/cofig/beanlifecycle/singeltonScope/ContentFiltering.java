package com.bean.lifecycle.cofig.beanlifecycle.singeltonScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ContentFiltering implements Filterr{

    private static int instances;

    @Autowired
    private Movie movie;

    public ContentFiltering(){
        super();
        instances++;
        System.out.println("Content Filter Constructor Called!!!!");
    }

    public Movie getMovie(){
        return this.movie;
    }

    public static int getInstances(){
        return instances;
    }



    public String[] getMovies(String movie) {
        return new String[]{"Italian Job","MI","MI3"};
    }
}
