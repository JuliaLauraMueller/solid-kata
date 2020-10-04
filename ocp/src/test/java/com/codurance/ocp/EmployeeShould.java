package com.codurance.ocp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeShould {

    private static final int BONUS = 100;
    private static final int SALARY = 1000;
    private static final int EXTRA = 500;

    @Test
    public void not_add_bonus_to_the_engineer_pay_amount() {
        Employee engineer = new Engineer(SALARY, BONUS);
        assertThat(engineer.payAmount())
                .isEqualTo(SALARY);
    }


    @Test
    public void add_bonus_to_the_manager_pay_amount() {
        Employee manager = new Manager(SALARY, BONUS);
        assertThat(manager.payAmount())
                .isEqualTo(SALARY+BONUS);
    }

    @Test
    public void add_extra_bonus_to_ceo_pay_amount(){
        Employee ceo = new CEO(SALARY, BONUS, EXTRA);
        assertThat(ceo.payAmount())
                .isEqualTo(SALARY+BONUS+EXTRA);
    }
}