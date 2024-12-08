package com.jarosinski.bootnest.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public static final String BEAN_NAME = "tennisCoach";

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
