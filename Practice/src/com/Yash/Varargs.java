package com.Yash;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {

         fun(5,6,7,8);

    }
    static void fun(int...numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
