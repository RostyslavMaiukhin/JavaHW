package ua.matyukhin.hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillArrayRandom(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(arrayTargetDelete(numbers)));
    }

    public static int[] arrayTargetDelete(int[] numbers) {
        int[] workArray = Arrays.copyOf(numbers, numbers.length - 1);
        int target = targetInitial(workArray);
        for (int i = 0, j = 0; i < numbers.length; i++, j++) {
            if (target == workArray.length) break; //Знаю - не по феншую,но так выглядит компактно,не бейте
            if (i == target) i++;
            workArray[j] = numbers[i];
        }
        return workArray;
    }

    public static int targetInitial(int[] workArray) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите какой элемент удалить. Диапазон от 0 до " + workArray.length + "\n");
        int target = scan.nextInt();
        while (target > workArray.length) {
            System.out.println("Доступно от 0 до " + workArray.length);
            target = scan.nextInt();
        }
        return target;
    }


    private static void fillArrayRandom(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomLength = random.nextInt(9);
            numbers[i] = randomLength;
        }
    }
}
