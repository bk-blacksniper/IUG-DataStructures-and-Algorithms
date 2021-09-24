package com.company;

public class Person {
    // encapsulating the class parameters and set it private to prevent direct access for them.
    // you can access it throw getters and setters
    private int id;
    private String name;

    public Person(){}

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}