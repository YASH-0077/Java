package com.Yash;

public class Performance {
    static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + 1);
            System.out.println(ch);
            series = series + ch; // series += ch

        }
        System.out.println(series);

    }
}
