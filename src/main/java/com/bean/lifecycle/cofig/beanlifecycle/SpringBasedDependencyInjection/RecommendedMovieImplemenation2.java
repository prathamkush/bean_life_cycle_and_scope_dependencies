package com.bean.lifecycle.cofig.beanlifecycle.SpringBasedDependencyInjection;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;


// Making this as a bean via spring so that it will get selected
@Component
public class RecommendedMovieImplemenation2 {


    //private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    private Filterr filter;

    // Defining dependency as Filterr via spring
    //@Autowired
    //private Filterr filter;
    // private Filter contentFiltering; // manually injecting dependency



    //Injecting via Setter
    @Autowired
    @Qualifier("CF2")
    public void setFilter(Filterr filter){
        this.filter = filter;
    }

    @PostConstruct
    public void databaseConnection(){
        //logger.info("Running this method first before any bean methods");
        System.out.println("Established Connection here for RecommendedMovieImplementation2 ");
    }


    @PreDestroy
    public void disconnectDatabase(){
        System.out.println("In RecommendedMovieImplementation2 Pre Destroy Method");
    }




    /*
    // Constructor Injection (Autowiring + Injecting)
    public RecommendedMovieImplemenation(@Qualifier("CF") Filterr filter){
        this.filter = filter;
    }
    */


    //public RecommendedMovieImplemenation(Filterr filter){
    //    this.filter = filter;
    //}

    public String[] recommendedMovie(String movie){
        System.out.println("Checking the filter names in usage : "+ filter+"\n");
        String[] resultMovies = filter.getRecommendatins(movie);

        return resultMovies;
    }
}
