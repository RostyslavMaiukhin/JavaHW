package ua.matyukhin.modul1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];
        System.out.println(horseAdventure(chessBoard));
    }

    private static boolean horseAdventure(int[][] cords) {
        int[][] navigationAllow = horseNavMesh(cords); //Заполняем все возможные эллементы куда конь может пойти.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите поле куда конь пойдет : ");
        int[] scanCords = scanInput(scan);
        int x = scanCords[0];
        int y = scanCords[1];
        return cords[x][y] == 1;
    }

    public static int[][] horseNavMesh(int[][] cords) { //определяет всевозможные ходы коня с заданой точки
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите поле где конь стоит : ");
        int[] scanCords = scanInput(scan);
        int x = scanCords[0];
        int y = scanCords[1];
        cords[x][y] = 7;  //показывает положение коня на "доске"
        if (x > 1 && y > 0) {           //Индуский код
            cords[x - 2][y - 1] = 1;
        }
        if (x > 0 && y > 1) {
            cords[x - 1][y - 2] = 1;
        }
        if (x > 1 && y <= 6) {
            cords[x - 2][y + 1] = 1;
        }
        if (x > 0 && y <= 5) {
            cords[x - 1][y + 2] = 1;
        }
        if (x <= 6 && y > 1) {
            cords[x + 1][y - 2] = 1;
        }
        if (x <= 5 && y > 0) {
            cords[x + 2][y - 1] = 1;
        }
        if (x <= 6 && y <= 5) {
            cords[x + 1][y + 2] = 1;
        }
        if (x <= 5 && y <= 6) {
            cords[x + 2][y + 1] = 1;
        }
        System.out.println(Arrays.deepToString(cords).replace("],", "]\n"));
        return cords;
    }

    public static int[] scanInput(Scanner scan) {
        int x = 0;
        int y = 0;
        int counter = 0;
        String axisX = "abcdefgh";
        String axisY = "12345678";
            String userInput = scan.nextLine().toLowerCase();
            for (int i = 0; i < axisX.length(); i++) {
                if (axisX.charAt(i) == userInput.charAt(0)) {
                    y = i;
                    counter++;
                }
                if (axisY.charAt(i) == userInput.charAt(1)) {
                    x = i;
                    counter++;
                }
            }
        return new int[]{x, y};
    }
}

