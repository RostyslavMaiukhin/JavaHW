package ua.matyukhin.hw3;

public class Task3 {

    public static void main(String[] args) {
        String simpleText = "   пробелы в    начале, между и в конце, а слов тут 10 10   10 10     ";
        System.out.println("В этой строчке " + wordsCounter(simpleText) + " слов");
    }

    // Считаем слова
    public static int wordsCounter(String newText) {
        String spaceSecurity = newText.trim(); //Ловим лишние пробелы в начале и в конце
        String[] textDelimiter = spaceSecurity.split(" ");
        int counter = textDelimiter.length;
        for (String s : textDelimiter) {
            if (s.matches("\\d+")) {
                counter--;
            }
        }
        //Ловим лишние пробелы между словами
        for (int j = 0; j < spaceSecurity.length(); j++) {
            if (spaceSecurity.charAt(j) == ' ' && spaceSecurity.charAt(j + 1) == ' ') {
                counter--;
            }
        }
        return counter;
    }
}