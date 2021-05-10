package ua.matyukhin.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (1 - 10) + 10); //с 0 геометрическое считать скучно
        }
        System.out.println("Исходный массив " + Arrays.toString(numbers));

        System.out.println("Протсых чисел: " + simple(numbers));
    }

    public static int simple(int[] numbers) {
        int counter = 0;
        int counterSimple=0;
        int[] workArray = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < workArray.length; i++) {
            for (int j = 1; j < workArray[i]; j++) {
                if (workArray[i]%j==0){
                    counter++;
                }
            }
            if (counter==1){
                counterSimple++;
            }
            counter=0;
        }
        return counterSimple;
    }
}
