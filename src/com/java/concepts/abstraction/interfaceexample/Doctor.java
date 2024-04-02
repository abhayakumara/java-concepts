package com.java.concepts.abstraction.interfaceexample;

public class Doctor implements Career{
    @Override
    public void printCareer() {
        System.out.println("Doctor");
    }

    @Override
    public void isGoodChoice() {
        System.out.println("Nope");
    }
}
