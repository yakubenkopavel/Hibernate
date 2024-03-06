package org.example.firstExample;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Classic";
    }


    public void initMethod(){
        System.out.println("Init");
    }


    public void destroyMethod(){
        System.out.println("Destroy");
    }
}
