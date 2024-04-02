package com.java.concepts.abstraction.interfaceexample;

public class Engineer implements Career{
    @Override
    public void printCareer() {
        System.out.println("Engineer");
    }

    @Override
    public void isGoodChoice() {
        System.out.println("Yes");
    }
}
