package com.example.object.chapter1_2;

import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    public static Money wons(BigDecimal amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money times(double discountPercent) {
        
    }

    public Money minus(Money discountAmount) {
    }
}
