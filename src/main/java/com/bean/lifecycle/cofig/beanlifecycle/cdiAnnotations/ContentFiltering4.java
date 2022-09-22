package com.bean.lifecycle.cofig.beanlifecycle.cdiAnnotations;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Named;




// Making this class - ContentFiltering as a bean
@Named
@Qualifier("CF4")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContentFiltering4 implements Filterr4 {
    @Override
    public String[] getRecommendatins(String movie) {
        return new String[]{"Italian Job","MI","MI3"};
    }
}
