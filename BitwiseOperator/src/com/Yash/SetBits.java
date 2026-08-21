package com.Yash;

public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbit(n));

    }
    private static int setbit(int n){
        int count = 0;

        while(n>0){
            count++;
            n = (n&(n-1));
        }
        return count;
    }
}
