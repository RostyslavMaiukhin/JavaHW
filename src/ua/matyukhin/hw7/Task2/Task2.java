package ua.matyukhin.hw7.Task2;

public class Task2 {
    public static void main(String[] args) {
        Student student = new Student("Катя", "Петрова", "ПЦБ", 4);
        Student aspirant = new Aspirant("Петя", "Пупкин", "ПГС", 5, "360 no scope");
        Student[] students = new Student[2];
        students[0] = student;
        students[1] = aspirant;
        for (Student sendParam : students) {
            System.out.println(sendParam.getScholarship(sendParam));
        }
    }
}
