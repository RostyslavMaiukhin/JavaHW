package ua.matyukhin.Demo;

import java.io.BufferedReader;
import java.io.IOException;

public class OwnExceptionCall {
    public static void testCCE(int number) {
        try {
            Object CCE = number;
            String text = (String) CCE;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public static void testNPE(String text) {
        try {
            BufferedReader reader = null;
            try {
                reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void testNFE(String text) {
        try {
            int i = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void testAIOOB(int number) {
        int[] array = new int[number];
        try {
            int boom = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        testCCE(777);
        testNPE("test");
        testNFE("1test");
        testAIOOB(2);
    }
}
