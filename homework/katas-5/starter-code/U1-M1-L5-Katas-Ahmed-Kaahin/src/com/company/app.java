package com.company;

public class app {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;
        int num3 = 5;

        int subTwoNum = 0;
        int NegZero = 0;
        int intMin = 0;
        int intMax = 0;
        boolean isTrue = false;

        subTwoNum = subtract(num1, num2);
        NegZero =   subtractOrZero(num1, num2);
        intMax =    max(num1, num2, num3);
        intMin =    min(num1, num2, num3);
        isTrue =  isLarger(num1, num2);


        System.out.println("substraction of two number is " + subTwoNum);
        System.out.println("subtract two  if neg return zero " + NegZero);
        System.out.println("max of the three number is " + intMax);
        System.out.println("min of the three number is " + intMin);
        System.out.println(" first is larger than second " + isTrue);

    }//end of main

    public static int subtract(int a, int b) {
        return a - b;
    }//end of subtract

    public static int subtractOrZero(int a, int b) {
        if (a - b < 0) {
            return 0;
        } else {
            return a - b;
        }
    }//end subtractzero

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else return c;
    }//endof max

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else return c;
    }//endof min

    public static boolean isLarger(int first, int second) {

        if (first > second) {

           return true;
        }
        return false;
    }//endof islarger




    }//end of class
