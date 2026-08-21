package com.Yash;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);


    }
    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfspaces = n -totalColsInRow ;
            for (int s = 0; s < noOfspaces;s++) {
                System.out.print(" ");
                
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
