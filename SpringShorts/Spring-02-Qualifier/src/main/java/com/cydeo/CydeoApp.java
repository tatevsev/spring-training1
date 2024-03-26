package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.service.JavaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        JavaService java = container.getBean(JavaService.class);

        java.getTeachingHours();


    }
}
