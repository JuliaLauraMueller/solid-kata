package com.codurance.isp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class SpecificDogShould {
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    private final SpecificDog specificDog = new SpecificDog();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(consoleContent));
    }


    @Test
    void run() {
        specificDog.run();
        assertThat(consoleContent.toString())
                .isEqualTo("Dog is running");
    }

    @Test
    void bark() {
        specificDog.bark();
        assertThat(consoleContent.toString())
                .isEqualTo("Dog is barking");
    }
}