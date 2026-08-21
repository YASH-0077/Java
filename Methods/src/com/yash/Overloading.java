package com.yash;
public class Overloading {

    static void greet() {
        System.out.println("Hello!");
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static void greet(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    public static void main(String[] args) {
        greet();
        greet("Yash");
        greet("Yash", 18);
    }
}



