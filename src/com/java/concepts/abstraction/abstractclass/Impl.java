package com.java.concepts.abstraction.abstractclass;

public class Impl extends AbstractClass{
    @Override
    void get() {
        System.out.println("test");
    }


    @Override
    public void normal() {
        super.normal();
        System.out.println("overridden normal from child");
    }

    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.normal();
    }
}
