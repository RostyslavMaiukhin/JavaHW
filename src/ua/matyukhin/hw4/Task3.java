package ua.matyukhin.hw4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (1 - 100) + 100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Составных чисел: " + compositedNumber(numbers));
    }

    public static int compositedNumber(int[] numbers) {
        int counter = 0;
        int counterCompos = 0;
        for (int k : numbers) {
            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    counter++;
                }
            }
            if (counter >= 1) {
                counterCompos++;
            }
            counter = 0;
        }
        return counterCompos;
    }
}
