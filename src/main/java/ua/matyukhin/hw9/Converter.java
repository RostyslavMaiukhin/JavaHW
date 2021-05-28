package ua.matyukhin.hw9;

import java.util.Scanner;

public class Converter extends Chess{
    public Converter(Converter converterMock) {
        this.converter = converterMock;
    }

    public static int[] scanInput(String inputCord) {
        int count = 0;
        int x = 10;
        int y = 10;
        String axisX = "abcdefgh";
        String axisY = "12345678";
        for (int i = 0; i < axisY.length(); i++) {
            if (axisY.charAt(i) == inputCord.charAt(1) && inputCord.length() < 3) {
                x = i;
                count++;
            }
        }
        for (int j = 0; j < axisX.length(); j++) {
            if (axisX.charAt(j) == inputCord.charAt(0) && inputCord.length() < 3) {
                y = j;
                count++;
            }
        }
        int[] move = new int[]{x,y};
        if (count == 2) {
            return move;
        }
        return new int[10];
    }

}
