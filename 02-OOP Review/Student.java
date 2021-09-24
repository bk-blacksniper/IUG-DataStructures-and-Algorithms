package com.company;

// Person class is the parent for the Student class
public class Student extends Person {
    private double GPA;

    // default constructor
    public Student(){}

    // constructor overloading
    public Student(int id, String name, double GPA) {
        // calling the super constructor (parent)
        super(id,name);
        this.GPA = GPA;
    }

    // getter method
    public double getGPA() {
        return GPA;
    }

    // setter method
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // overriding the toString method from the Java Object class
    @Override
    public String toString(){
        return "id : "+ this.getId() + ", name : "+ super.getName() + " GPA : " + this.getGPA();
    }
}
