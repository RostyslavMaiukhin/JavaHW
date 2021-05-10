package ua.matyukhin.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (1 - 100) + 100);
        }
        System.out.println("Исходный массив " + Arrays.toString(numbers));

        System.out.println("Протсых чисел: " + primeNumbers(numbers));
    }

    public static int primeNumbers(int[] numbers) {
        int counter = 0;
        int counterSimple=0;
        int[] workArray = Arrays.copyOf(numbers, numbers.length);
        for (int k : workArray) {
            for (int j = 1; j < k; j++) {
                if (k % j == 0) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println(k);
                counterSimple++;
            }
            counter = 0;
        }
        return counterSimple;
    }
}
