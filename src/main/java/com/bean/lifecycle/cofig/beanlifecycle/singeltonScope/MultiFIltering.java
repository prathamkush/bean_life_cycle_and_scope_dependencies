package com.bean.lifecycle.cofig.beanlifecycle.singeltonScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MultiFIltering implements Filterr{

    public MultiFIltering(){
        super();
    }

    public String[] getMovies(String movie) {
        return new String[]{"Ice Age", "Toy Story", "The Croods"};
    }
}
