package ua.matyukhin.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class OwnExceptionCall {
    public static void testCCE(int number) {
        try {
            Integer CCE = number;
            int text = CCE;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public static void testNPE(String text) {
        try {
            BufferedReader reader = new BufferedReader(Reader.nullReader());
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
            int i = (Integer.parseInt(text));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
public static void testAIOOB (int number){
    int[] array = new int[number];
    try {
        int boom = array[number-1];
    }catch (ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
    }

}
    public static void main(String[] args) {
        testCCE(777);
        testNPE("test");
        testNFE("1");
        testAIOOB(2);
    }
}
