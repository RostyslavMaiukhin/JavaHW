package ua.matyukhin.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[3]; // хоть какой то шанс, что выпадет Тру
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(checkNonIncrease(numbers));
    }

    public static boolean checkNonIncrease(int[] numbers) {
        int counter = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                counter++;
            }
        }
        return counter == numbers.length - 1;
    }

    public static void fillArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomLength = random.nextInt(10);
            numbers[i] = randomLength;
        }
    }
}
