package com.example.object.chapter1_2;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfied(Screening screening) {
        return false;
    }
}
