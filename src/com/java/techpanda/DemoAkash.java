package com.java.techpanda;

public class DemoAkash {

    public static void main(String[] args) {

        System.out.println("Addition: " + sum(6, 2));
        System.out.println("Subtraction: " + subtract(6, 2));
        System.out.println("Multiplication: " + multiply(6, 2));
        System.out.println("Division: " + divide(6, 2));
        System.out.println("Modulus: " + modulus(3, 2));

    }


    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

   
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

}
