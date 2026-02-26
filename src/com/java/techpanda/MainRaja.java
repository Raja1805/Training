package com.java.techpanda;

public class MainRaja {

    public static String MY_NAME_CONST = "Raja";

    public static void main(String[] args){
        int sumValue = doAdditionOfTwoNumber(1,2);
        System.out.print(sumValue);
        System.out.print(doAddition());
    }

    public static int doAdditionOfTwoNumber(int num1, int num2){
        return num1 + num2;
    }

    public static int doAddition(){
        int num1 = 2;
        int num2 = 5;
        return num1 + num2;
    }
}
