package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first value");
        float firstValue = in.nextFloat();
        System.out.println("Input second value");
        float secondValue = in.nextFloat();
        System.out.println("Input operation");
        String operation = in.next();

        Calculator myCalculator = new Calculator();
        myCalculator.setFirstValues(firstValue);
        myCalculator.setSecondValue(secondValue);
        myCalculator.setOperation(operation);

        try {
            myCalculator.calculate();
        } catch (DivideNull e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        in.close();
    }
}