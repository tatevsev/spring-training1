package com.cydeo.service;

import org.springframework.stereotype.Component;

@Component
public class OfficeHoursService implements ExtraSessions{
    @Override
    public int getHours() {
        return 5;
    }
}
