package com.company;

public class Author {
    private final String name;
    private final String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {

        return this.name;
    }

    public String getSurName() {

        return this.surName;
    }
}
