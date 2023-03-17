package com.ganttfx;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.ganttfx.models.Activity;
import com.ganttfx.models.ActivityState;

public class ActivityTest {
    Activity activity1 = new Activity(0, "Creation of the mock-up", 
    LocalDate.of(2023, 03, 26), 
    LocalDate.of(2023, 03, 26));

    Activity activity2 = new Activity(1, "Implementierung",
    LocalDate.of(2023, 03, 1),
    LocalDate.of(2023, 03, 30));

    Activity activity3 = new Activity(1, "Testing",
    LocalDate.of(2023, 02, 20),
    LocalDate.of(2023, 02, 23));

    LocalDate today = LocalDate.now();
    ActivityState state;


    @Test
    void TestActivityDuration(){
        assertEquals(1, activity1.getDuration());
        assertEquals(30, activity2.getDuration());
    }

    @Test
    void TestActivityState(){
        assertEquals(state.HALTED, activity1.getState());
        assertEquals(state.TERMINATED, activity3.getState());
        assertEquals(state.RUNNING, activity2.getState());
    }
 
    @Test
    void TestActivityProgress(){
        assertEquals(0, activity1.getProgress());
        assertEquals(1, activity3.getProgress());
        assertEquals(0.5666666666666667, activity2.getProgress());
    }
}
