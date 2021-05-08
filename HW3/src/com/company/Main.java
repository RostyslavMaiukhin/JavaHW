package com.company;

public class Main {

    public static void main(String[] args) {
        String simpleText = " У нас всякие буквы, типа у и в с - не слова      ";
        String filteredText = deleteSpace(simpleText);
        System.out.println(checkTenet(filteredText));
        System.out.println(wordsCounter(simpleText));
    }

    // Считаем слова бульше 2х букв
    public static int wordsCounter(String newText) {
        String spaceSecurity = newText.trim(); // страховка от лишних пробелов
        int counter = 0;
        if (spaceSecurity.length() != 0) {
            counter++;
            for (int i = 0; i < spaceSecurity.length(); i++) {
                if (spaceSecurity.charAt(i) == ' ') {
                    counter++;
                    if (i > 1 && spaceSecurity.charAt(i - 2) == ' ') {  //Если не считать 1 символ за слово
                        counter--;
                    }
                }
            }
            if (spaceSecurity.charAt(1) == ' ') counter--; // страховка от одиночной буквы в начале
        }
        return counter;
    }

    // Удаляем пробелы между словами
    public static String deleteSpace(String newString) {
        newString = newString.replaceAll("\\s+", "").toLowerCase();
        return newString;
    }

    //Проверяем на палиндром v2
    public static boolean checkTenet(String ifTenet) {
        StringBuilder tenet = new StringBuilder(ifTenet);
        StringBuilder tenetReverse = tenet.reverse();
        String tenetReverseString = tenetReverse.toString();
        return ifTenet.equals(tenetReverseString);

        //  //Проверяем на палиндром v1
//        char[] words = ifTenet.toCharArray();
//        int count = 0;
//        int i = 0;
//        int j = words.length;
//        int copyJ = j;
//        for (; j / 2 >= 1; i++, j--) {
//            if (words[i] == words[j - 1]) {
//                count++;
//            }
//        }
//        return count == copyJ - 1;
    }
}