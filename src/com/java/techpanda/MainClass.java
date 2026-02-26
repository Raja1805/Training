package com.java.techpanda;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(sum(4, 8));
        System.out.print(multi());
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int multi() {
        int num1 = 3;
        int num2 = 5;
        return num1 * num2;
    }
}

