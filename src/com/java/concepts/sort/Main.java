package com.java.concepts.sort;

import com.java.concepts.sort.entity.Address;
import com.java.concepts.sort.entity.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 20, "a",20000, new Address(1, "a", "z"));
        Employee e2 = new Employee(2, 21, "b",30000, new Address(2, "f", "a"));
        Employee e3 = new Employee(3, 22, "e",10000, new Address(7, "s", "w"));
        Employee e4 = new Employee(4, 23, "ad",50000, new Address(3, "r", "l"));
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
//        Sort based on id
//      employees.sort(((o1, o2) -> o2.id() - o1.id()));
//      employees.sort(Comparator.comparingInt(Employee::id));
//                Sort based on name
//        employees.sort(((o1, o2) -> o2.name().compareTo(o1.name())));
//
//                Sort based on adress
        employees.sort(((o1, o2) -> o2.address().compareTo(o1.address())));
        System.out.println(employees);
    }
}
