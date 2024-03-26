package com.cydeo.service;

import com.cydeo.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JavaService {

    private final ExtraSessions extraSessions;
    private final JavaRepository javaRepository;

    @Autowired
    public JavaService(@Qualifier("Mentor") ExtraSessions extraSessions, JavaRepository javaRepository) {
        this.extraSessions = extraSessions;
        this.javaRepository = javaRepository;
    }

    public void getTeachingHours(){
        System.out.println("Weekly Java Hours: " + (javaRepository.returnHours()+extraSessions.getHours()));
    }
}
