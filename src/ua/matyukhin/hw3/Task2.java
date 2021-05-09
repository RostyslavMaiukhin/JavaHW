package ua.matyukhin.hw3;

public class Task2 {

    public static void main(String[] args) {
        String simpleText = "T e Ne t";
        String filteredText = deleteSpace(simpleText);
        System.out.println(checkTenet(filteredText));
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
        //Проверяем на палиндром v1
/*        char[] words = ifTenet.toCharArray();
       int count = 0;
       int i = 0;
       int j = words.length;
        int copyJ = j;
       for (; j / 2 >= 1; i++, j--) {
            if (words[i] == words[j - 1]) {
                count++;
            }
        }
        return count == copyJ - 1;
    }
} */
    }
}