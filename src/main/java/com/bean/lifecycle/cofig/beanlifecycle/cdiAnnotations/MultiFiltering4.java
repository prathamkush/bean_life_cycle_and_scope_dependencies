package com.bean.lifecycle.cofig.beanlifecycle.cdiAnnotations;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Qualifier("MF4")
@Singleton
public class MultiFiltering4 implements Filterr4 {

    @Override
    public String[] getRecommendatins(String movie) {
        return new String[]{"Ice Age", "Toy Story", "The Croods"};
    }
}
