package ua.matyukhin.hw7;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship(Student aveMark) {
        if (aveMark.averageMark == 5) {
            return 100;
        }
        return 80;
    }
}
