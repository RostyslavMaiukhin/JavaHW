package ua.matyukhin.hw4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[400];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (1 - 100) + 100); //с 0 геометрическое считать скучно
        }
        System.out.println("Исходный массив " + Arrays.toString(numbers));
        System.out.println("Среднее Арифметическое " + middleArithmetic(numbers));
        System.out.println("Среднее Геометрическое " + middleGeometric(numbers));
    }

    public static int middleArithmetic(int[] numbers) {
        int sum = 0;
        int result = 0;
        for (int j : numbers) {
            sum += j;
        }
        return result = sum / numbers.length;
    }

    public static double middleGeometric(int[] numbers) {
        int geometricArray = numbers.length;
        double multi = 0;
        for (int j : numbers) {
            if (j == 0) {
                return 0;
            }
            multi += Math.log(j);
        }
        return Math.exp(multi / geometricArray);
    }
    // Работает с рандомом до 10
//    public static double middleGeometric(int[] numbers) {
//        int[] geometricArray = Arrays.copyOf(numbers, numbers.length);
//        double multi = 1;
//        double result = 0;
//        double powForResult = geometricArray.length;
//        for (int i = 0; i < geometricArray.length; i++) {
//            multi *= geometricArray[i];
//        }
//        return result = Math.pow(multi, 1 / powForResult);
//    }
}
