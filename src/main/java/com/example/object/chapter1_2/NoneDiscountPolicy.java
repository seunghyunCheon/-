package com.example.object.chapter1_2;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
