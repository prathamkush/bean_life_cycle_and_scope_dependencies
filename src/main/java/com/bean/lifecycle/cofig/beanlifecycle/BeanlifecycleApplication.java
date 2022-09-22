package com.bean.lifecycle.cofig.beanlifecycle;


//import com.bean.lifecycle.cofig.beanlifecycle.singeltonScope.ContentFiltering;
//import com.bean.lifecycle.cofig.beanlifecycle.singeltonScope.Movie;
//import com.bean.lifecycle.cofig.beanlifecycle.singeltonScope.MovieRecommenderSystem;
//import com.bean.lifecycle.cofig.beanlifecycle.singeltonScope.MultiFIltering;


import com.bean.lifecycle.cofig.beanlifecycle.SpringBasedDependencyInjection.*;
import com.bean.lifecycle.cofig.beanlifecycle.cdiAnnotations.ContentFiltering4;
import com.bean.lifecycle.cofig.beanlifecycle.cdiAnnotations.MultiFiltering4;
import com.bean.lifecycle.cofig.beanlifecycle.cdiAnnotations.RecommendedMovieImplemenation4;
import com.bean.lifecycle.cofig.beanlifecycle.lifeCyclePrototypeScopedBeans.Movie1;
import com.scopeProxy.Movie;
import com.scopeProxy.ContentFiltering;
import com.scopeProxy.MultiFIltering;

//import scope.MovieRecommenderSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@ComponentScan(basePackages = "com.scope")
//@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.scope"))

@SpringBootApplication
@ComponentScan(basePackages = {"com.scopeproxy", "com.bean.lifecycle.cofig.beanlifecycle.SpringBasedDependencyInjection", "com.bean.lifecycle.cofig.beanlifecycle.lifeCyclePrototypeScopedBeans","com.bean.lifecycle.cofig.beanlifecycle.cdiAnnotations"})
public class BeanlifecycleApplication {
	public static void main(String[] args) {
		// Spring based Automanaging Dependencies
		ApplicationContext appContextObj = SpringApplication.run(BeanlifecycleApplication.class, args);

		// Singelton Bean (default) given to content
		ContentFiltering obj1 = appContextObj.getBean(ContentFiltering.class);
		ContentFiltering obj2 = appContextObj.getBean(ContentFiltering.class);
		ContentFiltering obj3 = appContextObj.getBean(ContentFiltering.class);

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);


		// Prototype (multi)
		MultiFIltering obj4 = appContextObj.getBean(MultiFIltering.class);
		MultiFIltering obj5 = appContextObj.getBean(MultiFIltering.class);
		MultiFIltering obj6 = appContextObj.getBean(MultiFIltering.class);

		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);


		// INJECTING PROTOTYPE (Movie) INTO SINGELTON (Content)
		// PROXY INSERTING PROTOTYPE BEAN
		ContentFiltering filter = appContextObj.getBean(ContentFiltering.class);
		ContentFiltering filter2 = appContextObj.getBean(ContentFiltering.class);
		System.out.println("\n Content Filter Bean with Singleton scope");
		System.out.println(filter);
		System.out.println(filter2);

		// Retrieve and print prototype bean form the single bean twice
		// Prototype Movie = Singleton filter.getMovie()
		// INJECTING PROTOTYPE SCOPE INTO SINGLETON SCOPE
		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();


		System.out.println("\n Movie Bean with Prototype Scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);


		// Number of Instances
		System.out.println("Number of Content FIlter Instances : "+ ContentFiltering.getInstances());

		// Number of Movie instances
		System.out.println("Number of Movie instances : "+ Movie.getInstances());

		System.out.println("---------------------------------------------");
		//--------------------------------------------------------------

		// POST CONSTRUCT and PRE DESTROY

		RecommendedMovieImplemenation2 recommeder3 = appContextObj.getBean(RecommendedMovieImplemenation2.class);
		String[] finalResultMovie3 = recommeder3.recommendedMovie("Some Movie");
		System.out.println("recommender3 = "+ Arrays.toString(finalResultMovie3));


		System.out.println("---------------------------------------------");
		//-----------------------------------------------------------

		// SINGLETON AND PROTOTYPE BEAN EXECUTION FOR POST CONSTRUCT AND PRE DESTROY

		// Singleton
//		ContentFilter3 cf3 = appContextObj.getBean(ContentFilter3.class);
//		System.out.println(cf3);
//
//		String[] newMovies = cf3.getRecommendations("Matrix");
//		System.out.println("newMovies = : "+Arrays.toString(newMovies));


		// Prototype
		Movie1 m1 = appContextObj.getBean(Movie1.class);
		System.out.println(m1);

		Movie1 m2 = appContextObj.getBean(Movie1.class);
		System.out.println(m2);

		System.out.println("----------------------------------------");
		//----------------------------------------------

		// CDI BASED DEPENDENCY INJECTIONS

		System.out.println("CDI BASED DEPENDENCY INJECTIONS");
		RecommendedMovieImplemenation4 recommender4 = appContextObj.getBean(RecommendedMovieImplemenation4.class);
		System.out.println(recommender4);
		System.out.println(recommender4.getFilter());
		System.out.println(Arrays.toString(recommender4.recommendedMovie("matrix")));

		// Prototype CDI
		System.out.println("PROTOTYPE CDI : ");
		ContentFiltering4 newObj1 = appContextObj.getBean(ContentFiltering4.class);
		ContentFiltering4 newObj2 = appContextObj.getBean(ContentFiltering4.class);

		System.out.println(newObj1);
		System.out.println(newObj2);
		System.out.println(Arrays.toString(newObj1.getRecommendatins("some movie")));

		// Singleton CDI
		System.out.println("SINGLETON CDI : ");
		MultiFiltering4 newObj3 = appContextObj.getBean(MultiFiltering4.class);
		MultiFiltering4 newObj4 = appContextObj.getBean(MultiFiltering4.class);

		System.out.println(newObj3);
		System.out.println(newObj4);
		System.out.println(Arrays.toString(newObj3.getRecommendatins("some other movie")));
	}


}
