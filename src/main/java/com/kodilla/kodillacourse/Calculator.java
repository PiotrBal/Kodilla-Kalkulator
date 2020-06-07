package com.kodilla.kodillacourse;

import static java.lang.System.*;

public class Calculator {
    public int adding(int one, int two) {
        return one + two;
    }
    public int subtract(int one, int two) {
        return one - two;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultadd = calculator.adding(11, 2);
        System.out.println(resultadd);
        int resultsubtract = calculator.subtract(94, 111);
        System.out.println(resultsubtract);
    }
}
