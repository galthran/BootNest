package com.jarosinski.bootnest.coach;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public static final String BEAN_NAME = "trackCoach";

    @Override
    public String getDailyWorkout() {
        return "Run a hard Ski!";
    }
}
