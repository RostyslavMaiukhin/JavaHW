package ua.matyukhin.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];
        fillArray(numbers);
        System.out.println(Arrays.deepToString(numbers).replace("], ", "]\n"));
        System.out.println(" ");
        System.out.println(Arrays.deepToString(arraySwap(numbers)).replace("], ", "]\n"));
    }

    public static int[][] arraySwap(int[][] numbers) {
        int temp = 0;
        int[][] workArray = Arrays.copyOf(numbers, numbers.length);
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 1; i < workArray.length; i++) {
                if (i >= j) {
                    temp = workArray[j][i];
                    workArray[j][i] = workArray[i][j];
                    workArray[i][j] = temp;
                }
            }
        }
        return workArray;
    }

    //Проще отслеживать работоспособность
    private static void fillArray(int[][] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = counter;
                counter++;
            }
        }
    }
//    private static void fillArrayRandom(int[][] numbers) {
//        Random random = new Random();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                int randomLength = random.nextInt(9);
//                numbers[i][j] = randomLength;
//            }
//        }
//    }
}
