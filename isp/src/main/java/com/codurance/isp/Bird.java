package com.codurance.isp;

public class Bird implements Animal {

    @Override
    public void run() {
        System.out.print("Bird is running");
    }
    public void fly() {
        System.out.print("Bird is flying");
    }
}