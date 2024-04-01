package com.java.concepts.functionalinterface;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "Abhay";
        Function<String, Integer> fun = String::length;
        ToIntFunction<String> funAsInt = String::length;
        Predicate<Boolean> pre = val -> !val;
        Consumer<String> con = s -> System.out.println(s + " " + s.length());

        System.out.println(sup.get());
        System.out.println(fun.apply("Abhay"));
        System.out.println(funAsInt.applyAsInt("Abhay"));
        System.out.println(pre.negate().or(pre).test(true));
        con.accept("Abhay");

        System.out.println(Function.identity().apply("Abhay"));



        BiConsumer<String, String> bcon =
                (s1, s2) -> System.out.println(s1 + " " + s2);

        BiFunction<String, Integer, Boolean> bfun =
                (s, i) -> s.length() == i;

        BiPredicate<String, Boolean> bpre = (s, b) -> s.contains("Abhay") && !b;


        bcon.accept("Abhay", "Basutakara");
        System.out.println(bfun.apply("Abhay", 5));
        System.out.println(bpre.test("Abhay", false));
     }
}
