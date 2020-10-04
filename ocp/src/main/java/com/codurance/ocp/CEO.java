package com.codurance.ocp;

public class CEO extends Employee{

    private final int extraBonus;

    CEO(int salary, int bonus, int extraBonus){
        super(salary, bonus);
        this.extraBonus = extraBonus;
    }

    @Override
    public int payAmount() {
        return salary + bonus + extraBonus;
    }
}
