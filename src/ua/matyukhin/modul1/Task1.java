package ua.matyukhin.modul1;

import java.util.Random;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayList = new int[5];
        System.out.println(Arrays.toString(initialArray(arrayList)));
        System.out.println("Уникальных чисел: " + checkOriginality(arrayList));
    }

    public static int checkOriginality(int[] checkArr) {
        int[] workArray = Arrays.copyOf(checkArr,checkArr.length);
        Arrays.sort(workArray);
        int counter = 1;
        for (int i = 1; i < workArray.length; i++, counter++) {
            if (workArray[i] == workArray[i - 1]) {
                counter--;
            }
        }
        return counter;
    }

    public static int[] initialArray(int[] inputArray) {
        Random random = new Random();
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(10);
        }
        return inputArray;
    }
}
