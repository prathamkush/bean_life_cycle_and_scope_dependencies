package com.bean.lifecycle.cofig.beanlifecycle.lifeCyclePrototypeScopedBeans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ContentFilter3 implements Filterr1{

    public ContentFilter3(){
        super();
        System.out.println("In Content Filter 3 constructor method");
    }

    @PostConstruct
    private void checkingPostConstructor(){
        System.out.println("In Content Filter 3 Post Constructor Method");
    }

    @PreDestroy
    private void checkingPreDestroy(){
        System.out.println("In Content Filter 3 Pre Destroy Method");
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"MI1","MI2","MI3"};
    }
}
