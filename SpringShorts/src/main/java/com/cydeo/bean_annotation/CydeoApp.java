package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.Callable;

public class CydeoApp {
    public static void main(String[] args) {

       ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,AnotherConfigApp.class);

       FullTimeMentor fullTimeMentor =  container.getBean(FullTimeMentor.class);

       fullTimeMentor.createAccount();

       PartTimeMentor partTimeMentor = container.getBean(PartTimeMentor.class);
       partTimeMentor.createAccount();

       String srt = container.getBean(String.class);
        System.out.println(srt);

        Integer i = container.getBean(Integer.class);
        System.out.println(i);


    }
}
