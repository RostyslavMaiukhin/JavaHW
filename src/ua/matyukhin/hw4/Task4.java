package ua.matyukhin.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[2000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (1 - 10) + 10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Замена четных:  " + Arrays.toString(evenToZero(numbers)));
    }

    public static int[] evenToZero(int[] numbers) {
        int[] workArray = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i] % 2 == 0) {
                workArray[i] = 0;
            }
        }
        return workArray;
    }
}
