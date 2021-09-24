package com.company;

import java.util.Scanner;

public class Main {

    // static method
    // the (...) allows a method to take any number of arguments. They are accessible as an array in the method
    public static int sum(int ...args){
        int sum = 0;

        for (int number: args) {
            sum += number;
        }

        return sum;
    }

    // method overloading
    public static double sum(double ...args){
        double sum = 0.0;

        for(double number : args){
            sum += number + 0.0;
        }

        return sum;
    }

    public static void main(String[] args) {

        // you can enter any number of arguments in the method
        int intSum = sum(1,4,5,6,7,5,3,4);

        double doubleSum = sum(1.3,2.6,15.2,4);

        System.out.println(intSum);
        System.out.println(doubleSum);

        // creating an instance of the Student class
        Student std = new Student();
        // using setters to enter the values
        std.setId(1);
        std.setName("asd");
        std.setGPA(90.5);

        // using the constructor to enter values
        Student std2 = new Student(2,"ahmed", 60);
        System.out.println(std);
        System.out.println(std2);


        // data types
        // integers
        byte b = 1;
        short a = 32;
        long l = 423423;
        int ii = 4;

//         floating numbers
        float x = (float) 123.4234;
        double d = 43.423;

//         boolean
        boolean isGraduate = true;
        boolean isNotGraduate = false;

        // character
        char c = 'A';
        int A = 'A';
        System.out.println(c);
        System.out.println(A);


//        Strings
        String s2 = "Ali";
        String s24 = new String("asd");

        // arrays
        int[] asd = new int[10];
        asd[0] = 1;

        int[] das = {1,3,4,5,6};

        // 2D array
        int[][] dfgs = new int[10][2];
        int[][] gdfg = {
                {1,3,4,534,65,65},
                {34,43,43}
        };
        // invalid index (indexOutOfBoundException)
        System.out.println(gdfg[1][4]);



//         flow control
//        if statements
        String name = "ali";
        if(name.equalsIgnoreCase("ahmed")){
            System.out.println("your name is ahmed");
        }else if(name.equalsIgnoreCase("ali")){
            System.out.println("your name is Ali");
        }else{
            System.out.println("your name does not exists");
        }

//        switch statement
        int qw = 4;
        switch (qw){
            case 4:
            case 5:
                System.out.println(4);
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;

            default:
                System.out.println("error");
        }


//         loops

//        while loop
        int counter = 0;
        while (counter <= 10){
            System.out.println(++counter);
        }

//        do while loop
        int counter2 = 0;
        do{
            System.out.println(counter2);
            counter2++;
        }while(counter2 <= 10);

//        for loop
        int[] arr = {1,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        foreach loop
        for(int number: arr) {
            System.out.println(number);
        }
    }
}
