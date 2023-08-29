package org.example;

import java.util.Scanner;

/**
 * @author DAkhtyamov
 */
public class Calculator {
    private float firstValue;
    private float secondValue;
    private String operation;

    public float getFirstValue() {
        return firstValue;
    }

    public float getSecondValue() {
        return secondValue;
    }

    public String getOperation() {
        return operation;
    }

    public void setFirstValues(float value){
        firstValue = value;
    }
    public void setSecondValue(float value){
        secondValue = value;
    }
    public void setOperation(String value){
        operation = value;
    }

    public Calculator(){
        firstValue = 0;
        secondValue = 0;
        operation = "+";
    }

    /**
     * Sums values
     */
    public float sum(float firstValue, float secondValue) {
        return firstValue + secondValue;
    }

    /**
     * subtract values
     *
     * @param firstValue
     * @param secondValue
     * @return result
     */
    public float subtract(float firstValue, float secondValue) {
        return firstValue - secondValue;
    }

    /**
     * multiply values
     *
     * @param firstValue
     * @param secondValue
     * @return result
     */
    public float multiply(float firstValue, float secondValue) {
        return firstValue * secondValue;
    }

    /**
     * divide values
     *
     * @param firstValue
     * @param secondValue
     * @return result
     */
    public float divide(float firstValue, float secondValue) {
        return firstValue / secondValue;
    }

    /**
     * Choose operations with values
     */
    public void calculate() throws DivideNull{

        switch (operation) {
            case "+":
                System.out.printf("Result: %.4f", sum(firstValue, secondValue));
                break;
            case "-":
                System.out.printf("Result: %.4f", subtract(firstValue, secondValue));
                break;
            case "/":
                if (secondValue != 0) {
                    System.out.printf("Result: %.4f", divide(firstValue, secondValue));

                } else throw new DivideNull();
                break;
            case "*":
                System.out.printf("Result: %.4f", multiply(firstValue, secondValue));
                break;
            default:
                System.out.println("Wrong operation");
                break;
        }
    }
}

