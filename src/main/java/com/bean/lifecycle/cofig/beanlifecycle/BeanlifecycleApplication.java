package com.bean.lifecycle.cofig.beanlifecycle;

import com.bean.lifecycle.cofig.beanlifecycle.singeltonScope.ContentFiltering;
import com.bean.lifecycle.cofig.beanlifecycle.singeltonScope.Movie;
import com.bean.lifecycle.cofig.beanlifecycle.singeltonScope.MovieRecommenderSystem;
import com.bean.lifecycle.cofig.beanlifecycle.singeltonScope.MultiFIltering;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanlifecycleApplication {

	public static void main(String[] args) {
		// Spring based Automanaging Dependencies
		ApplicationContext appContextObj = SpringApplication.run(MovieRecommenderSystem.class, args);

		// Singelton Bean (default) givent to content
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
		// Proxy Inserting Prototype Bean
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






	}


}
