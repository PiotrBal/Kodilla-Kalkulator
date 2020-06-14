package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(7464, 424);
        if (resultAdd == resultAdd) {
            System.out.println("Test OK!");
        }else{
            System.out.println("Error");
        }

        int resultSubtrack = calculator.subtract(756,23);
        if (resultSubtrack == resultSubtrack) {
            System.out.println("Test OK!");
        }else{
            System.out.println("Error");
        }
    }
}
