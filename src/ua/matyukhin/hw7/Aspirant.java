package ua.matyukhin.hw7;

public class Aspirant extends Student {
    String ownWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String ownWork) {
        super(firstName, lastName, group, averageMark);
        this.ownWork = ownWork;
    }

    @Override
    public int getScholarship(Student aveMark) {
        if (aveMark.averageMark == 5) {
            return 200;
        }
        return 180;
    }

}
