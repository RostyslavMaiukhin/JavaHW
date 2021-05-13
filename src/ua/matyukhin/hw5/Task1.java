package ua.matyukhin.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        fillArray(numbers);
        System.out.println(Arrays.deepToString(numbers).replace("], ", "]\n"));
    }

    private static void fillArray(int[][] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (i % 2 != 0) ? -counter : counter;
                counter++;
            }
        }
    }
}