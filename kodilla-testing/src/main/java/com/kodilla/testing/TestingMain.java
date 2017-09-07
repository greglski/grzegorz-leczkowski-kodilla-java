package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy");

        Calculator calculator = new Calculator();

        int calculationResult = calculator.add(4,5);
        if(calculationResult == 4 + 5){
            System.out.println("calculator.add test OK");
        } else {
            System.out.println("calculator.add Error");
        }

        calculationResult = calculator.substract(5,4);
        if(calculationResult == 1){
            System.out.println("calculator.substract test OK");
        } else {
            System.out.println("claculator.substract Error");
        }
    }
}
