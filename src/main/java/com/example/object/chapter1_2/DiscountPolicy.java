package com.example.object.chapter1_2;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = conditions;
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if (each.isSatisFiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO;
    }

    abstract Money getDiscountAmount(Screening screening);
}
