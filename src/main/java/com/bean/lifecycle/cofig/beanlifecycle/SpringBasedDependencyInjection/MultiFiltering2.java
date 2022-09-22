package com.bean.lifecycle.cofig.beanlifecycle.SpringBasedDependencyInjection;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MF2")
public class MultiFiltering2 implements Filterr {

    @Override
    public String[] getRecommendatins(String movie) {
        return new String[]{"Ice Age", "Toy Story", "The Croods"};
    }
}
