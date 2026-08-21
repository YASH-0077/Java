package com.yash;
import java.util.Scanner;

    public class Armstrong {

        static boolean isArmstrong(int n) {
            int original = n;
            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                sum = sum + rem * rem * rem;
            }

            return sum == original;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = in.nextInt();

            if (isArmstrong(num)) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not an Armstrong Number");
            }
        }
}