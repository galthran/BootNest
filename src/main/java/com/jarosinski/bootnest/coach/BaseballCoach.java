package com.jarosinski.bootnest.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public static final String BEAN_NAME = "baseballCoach";

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
