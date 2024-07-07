package com.example.object.chapter3_4;

import com.example.object.chapter1_2.Money;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;
}
