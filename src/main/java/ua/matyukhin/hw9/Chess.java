package ua.matyukhin.hw9;

import java.util.Arrays;

public class Chess {
    Converter converter;
    public Chess(Converter converter) {
        this.converter = converter;
    }
    public Chess() {
    }

    public static void main(String[] args) {
        System.out.println(horseMove("f4", "d5"));
    }

    public static boolean horseMove(String a, String b) {
        int[][] chessBoardMove = new int[8][8];
        int[] scanCordsA = Converter.scanInput(a);
        int[] scanCordsB = Converter.scanInput(b);
        int[][] chessBoardToMove = new int[8][8];
        chessBoardMove[scanCordsA[0]][scanCordsA[1]] = 7;
        int x = scanCordsA[0];
        int y = scanCordsA[1];
        if (x > 1 && y > 0) {
            chessBoardMove[x - 2][y - 1] = 1;
        }
        if (x > 0 && y > 1) {
            chessBoardMove[x - 1][y - 2] = 1;
        }
        if (x > 1 && y <= 6) {
            chessBoardMove[x - 2][y + 1] = 1;
        }
        if (x > 0 && y <= 5) {
            chessBoardMove[x - 1][y + 2] = 1;
        }
        if (x <= 6 && y > 1) {
            chessBoardMove[x + 1][y - 2] = 1;
        }
        if (x <= 5 && y > 0) {
            chessBoardMove[x + 2][y - 1] = 1;
        }
        if (x <= 6 && y <= 5) {
            chessBoardMove[x + 1][y + 2] = 1;
        }
        if (x <= 5 && y <= 6) {
            chessBoardMove[x + 2][y + 1] = 1;
        }
        System.out.println(Arrays.deepToString(chessBoardMove).replace("],", "]\n"));
        return chessBoardMove[scanCordsB[0]][scanCordsB[1]] == 1;
    }
}
