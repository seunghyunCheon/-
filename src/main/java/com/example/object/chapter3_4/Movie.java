package com.example.object.chapter3_4;

import com.example.object.chapter1_2.Money;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;


@Getter
@Setter
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

}
