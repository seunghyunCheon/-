package com.example.object.chapter1_2;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class MovieClient {

    public static void main(String[] args) {
        Movie titanic = new Movie("타이타닉",
                Duration.ofMinutes(180),
                Money.wons(11000),
                new PercentDiscountPolicy(0.1),
                        new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                        new SequenceCondition(2),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))
        );
    }
}
