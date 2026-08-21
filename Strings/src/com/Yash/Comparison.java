package com.Yash;

public class Comparison {
    public static void main(String[] args) {
        String a = "Yash";
        String b = "Yash";
        String c = a;

        // ==
        //  System.out.println(a == b);


        String name1 = new String("Yash");
        String name2 = new String("Yash");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));



    }
}
