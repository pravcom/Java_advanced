import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберте режим:( 1 = Находим Макс/Мин элемент массива 2 = Формируем сладкий подарок");
        int mode = in.nextInt();

        if (mode == 1) {
            //- Массив размерностью 20
            int[] array = new int[20];
            Random rand = new Random();
//Он заполняется случайными целыми числами от -10 до 10
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(-10, 10);
            }
            MaxMinValueOfArray myMaxMinValueOfArray = new MaxMinValueOfArray();
            myMaxMinValueOfArray.setArray(array);
            System.out.println("Максимальное число -> " + myMaxMinValueOfArray.getMaxValueOfArray());
            System.out.println("Минимальное число -> " + myMaxMinValueOfArray.getMinValueOfArray());

            System.out.print("Массив до -> ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
            int[] arrayAfter = myMaxMinValueOfArray.changeMaxAndMinValueOfArray();
            System.out.print("\nМассив после -> ");
            for (int i = 0; i < arrayAfter.length; i++) {
                System.out.print(arrayAfter[i]);
                System.out.print(" ");
            }
        } else if (mode == 2) {
            Candy sweetPitCandy = new Candy();

            sweetPitCandy.setPrice(1.1F);
            sweetPitCandy.setName("SweetPit");
            sweetPitCandy.setWeight(0.4f);
            sweetPitCandy.setCount(40);

            Honey flowersHoney = new Honey();

            flowersHoney.setPrice(10F);
            flowersHoney.setName("SweetHoney");
            flowersHoney.setWeight(1f);
            flowersHoney.setType("Flowers");

            Jellybean yellowJellybean = new Jellybean();

            yellowJellybean.setPrice(5F);
            yellowJellybean.setName("Crabs");
            yellowJellybean.setWeight(0.5F);
            yellowJellybean.setColor("Yellow");

            Sweets[] gift = {sweetPitCandy, flowersHoney, yellowJellybean};

            float price = 0;
            float weight = 0;
            for (Sweets sweet:gift) {
                System.out.println("Name -> "+sweet.getName());
                System.out.println("Price -> "+sweet.getPrice());
                System.out.println("Weight -> "+sweet.getWeight());

                System.out.println();

                price = price + sweet.getPrice();
                weight = weight + sweet.getWeight();
            }

            System.out.println("Общая цена -> "+price);
            System.out.println("Общий вес -> "+weight);
        }
    }
}