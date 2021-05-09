package ua.matyukhin.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (1 - 10) + 10); //с 0 геометрическое считать скучно
        }
        System.out.println("Исходный массив " + Arrays.toString(numbers));

        System.out.println("Протсых чисел: " + simple(numbers));
    }

    public static int simple(int[] numbers) {
        int counter = 0;
        int[] workArray = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < workArray.length; i++) {
            if (simpleNumber(workArray[i]) == 1 || workArray[i] == 2) {
                counter++;
            }
        }
        return counter;
    }

    private static int simpleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }
            if ((i == number) || (i > Math.sqrt(number))) {

                return 1;
            }
        }
        return 0;
    }
}
