package com.Yash;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Yash");
                break;

            case 2:
                System.out.println("Ayush");
                break;

            case 3:
                System.out.println("Emp number 3");
                switch (Department) {

                    case "IT":
                        System.out.println("IT department");
                        break;

                    case "Management":
                        System.out.println("Managmnet department");
                        break;

                    default:
                        System.out.println("No department entered");
                }
            default:
                System.out.println("enter the correct empid");
        }
    }
}
