import java.util.Scanner;

/**
 * @author DAkhtyamov
 */
public class Calculator {
    float firstValue;
    float secondValue;
    String operation;
    void setFirstValues(float value){
        firstValue = value;
    }
    void setSecondValue(float value){
        secondValue = value;
    }
    void setOperation(String value){
        operation = value;
    }

    /**
     * Set initial params
     * @param firstValue
     * @param secondValue
     * @param operation
     */
    public Calculator(float firstValue, float secondValue, String operation) {
        setFirstValues(firstValue);
        setSecondValue(secondValue);
        setOperation(operation);
    }

    /**
     * Sums values
     */
    private float sum(float firstValue, float secondValue) {
        return firstValue + secondValue;
    }

    /**
     * subtract values
     *
     * @param firstValue
     * @param secondValue
     * @return result
     */
    private float subtract(float firstValue, float secondValue) {
        return firstValue - secondValue;
    }

    /**
     * multiply values
     *
     * @param firstValue
     * @param secondValue
     * @return result
     */
    private float multiply(float firstValue, float secondValue) {
        return firstValue * secondValue;
    }

    /**
     * divide values
     *
     * @param firstValue
     * @param secondValue
     * @return result
     */
    private float divide(float firstValue, float secondValue) {
        return firstValue / secondValue;
    }

    /**
     * Choose operations with values
     */
    public void calculate() {

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

                } else System.out.println("Divide NULL");
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
