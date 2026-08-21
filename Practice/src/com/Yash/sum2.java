package com.Yash;

import java.util.Scanner;

public class sum2 {
    static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number 1 : ");
        int num1 = in.nextInt();

        System.out.println("enter the number 2 : ");
        int num2 = in.nextInt();

        int sum2 = num1 + num2;
        return sum2;
    }
}
