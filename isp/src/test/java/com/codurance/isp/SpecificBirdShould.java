package com.codurance.isp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class SpecificBirdShould {
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    private final SpecificBird bird = new SpecificBird();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(consoleContent));
    }


    @Test
    void run() {
        bird.run();
        assertThat(consoleContent.toString())
                .isEqualTo("Bird is running");
    }

    @Test
    void fly() {
        bird.fly();
        assertThat(consoleContent.toString())
                .isEqualTo("Bird is flying");
    }
}