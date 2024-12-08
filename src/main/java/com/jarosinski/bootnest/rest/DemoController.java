package com.jarosinski.bootnest.rest;

import com.jarosinski.bootnest.coach.Coach;
import com.jarosinski.bootnest.coach.TrackCoach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach myCoach;

    public DemoController(@Qualifier(TrackCoach.BEAN_NAME) Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/daily-workout") // http://localhost:8080/daily-workout");
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
