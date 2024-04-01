package com.java.concepts.sort.entity;

public record Address(int id, String street, String city) implements Comparable<Address> {
    @Override
    public int compareTo(Address o) {
        return this.id() - o.id();
    }
}
