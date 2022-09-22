package com.bean.lifecycle.cofig.beanlifecycle.cdiAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;


// Making this as a bean via spring so that it will get selected
@Named
public class RecommendedMovieImplemenation4 {


    //private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    private Filterr4 filter;

    // Defining dependency as Filterr via spring
    //@Autowired
    //private Filterr filter;
    // private Filter contentFiltering; // manually injecting dependency



    //Injecting via Setter
    @Inject
    @Qualifier("MF4")
    public void setFilter(Filterr4 filter){
        this.filter = filter;
    }

    public Filterr4 getFilter(){
        return filter;
    }




//    @PostConstruct
//    public void databaseConnection(){
//        //logger.info("Running this method first before any bean methods");
//        System.out.println("Established Connection here for RecommendedMovieImplementation2 ");
//    }
//
//
//    @PreDestroy
//    public void disconnectDatabase(){
//        System.out.println("In RecommendedMovieImplementation2 Pre Destroy Method");
//    }
//



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
