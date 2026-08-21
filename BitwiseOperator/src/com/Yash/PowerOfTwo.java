package com.Yash;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;// note : fox for n=0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);

    }
}
