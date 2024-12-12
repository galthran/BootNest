package com.jarosinski.bootnest.coach;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Primary
@Component
@Scope("singleton")
public class CricketCoach implements Coach {

    public static final String BEAN_NAME = "cricketCoach";

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
