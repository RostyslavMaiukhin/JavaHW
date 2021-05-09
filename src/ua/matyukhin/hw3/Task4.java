package ua.matyukhin.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Давай угадывай: ");
        int humanInput = scan.nextInt();

        game(humanInput);
    }

    public static String game(int humanChoice) {
        int machine = (int) (Math.random() * 100);
        int human = 0;
        String winFail = "";
        while (human != machine) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Давай угадывай дальше: ");
            human = scan.nextInt();
            if (human > machine) {
                winFail = "Много";
            } else if (human < machine) {
                winFail = "Мало";
            } else {
                winFail = "Угадал";
            }
            System.out.println(winFail);
        }
        return winFail;
    }
}