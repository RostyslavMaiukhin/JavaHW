package com.company;

public class Main {

    public static void main(String[] args) {
        triangle();
        whoAreU(4);
        whoIsSmall(-5, -10, -8);
    }

    //
    static void triangle() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = -2;
        int x3 = -2;
        int y3 = -2;
        double p = 0.5 * (((x1 - x3) * (y2 - y3)) - ((y1 - y3) * (x2 - x3))); //или int и делить на 2
        if (p < 0) p *= -1;
        System.out.println(p);
    }

    //
    static void whoAreU(int check) {
        if (check % 2 == 0) {
            System.out.println(check + "-Четное");
        } else {
            System.out.println(check + "-Не четное");
        }
    }

    //
    static void whoIsSmall(int first, int second, int third) {
        int copycats = (first <= second && first <= third) ? first : (second <= first && second <= third) ? second : third;

        System.out.println("Самое маленькое число " + copycats);
    }
}