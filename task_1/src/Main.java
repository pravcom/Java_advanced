import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int numberTask = in.nextInt();
        //1 = Калькулятор 2 = Макс словов в массиве
        if(numberTask == 1) {
            System.out.println("Input first value");
            float firstValue = in.nextFloat();
            System.out.println("Input second value");
            float secondValue = in.nextFloat();
            System.out.println("Input operation");
            String operation = in.next();

            Calculator myCalculator = new Calculator(firstValue, secondValue, operation);
            myCalculator.calculate();
        } else if (numberTask == 2) {
            System.out.println("Input count of strings: ");
            int rowCount = in.nextInt();
            String[] str = new String[rowCount];

            for (int i = 0; i < rowCount; i++){
                System.out.println("Input string: ");
                str[i] = in.next();
            }

            MaxValuesOfArray maxArray = new MaxValuesOfArray(str);
            System.out.println("Max word: " + maxArray.getMaxValueOfArray());
        }
        in.close();

    }
}
