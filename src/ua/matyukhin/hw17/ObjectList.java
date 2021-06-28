package ua.matyukhin.hw17;

public class ObjectList {
    private final int id;
    private final String name;
    private final int count;

    public ObjectList(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
