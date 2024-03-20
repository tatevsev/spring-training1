package com.cydeo;

import com.cydeo.bean_annotation.PC;
import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(RandomConfig.class, ComputerConfig.class);

        BeanFactory context = new AnnotationConfigApplication();

        System.out.println("************Retrieving the beans******************");
       // Monitor theMonitor = container.getBean(Monitor.class);
        //Case theCase = container.getBean(Case.class);
       // Motherboard theMotherboard = container.getBean(Motherboard.class);

      //  PC myPc1 = new PC(theCase,theMonitor,theMotherboard);

      //  Monitor theMonitor2 = container.getBean("monitorSony",Monitor.class); //default bean name
        Monitor theMonitor3 = container.getBean("sony",Monitor.class);



    }
}
