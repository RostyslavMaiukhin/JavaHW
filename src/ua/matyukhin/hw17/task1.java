package ua.matyukhin.hw17;

import java.util.*;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) throws Exception {
        List<ObjectList> obj = List.of(
                new ObjectList(1, "Вася", 1),
                new ObjectList(2, "Данил", 10),
                new ObjectList(3, "Катя", 100),
                new ObjectList(4, "Лена", 1000),
                new ObjectList(5, "Румпельштильцхен", 666));

        List<String> allNames = obj.stream()
                .map(ObjectList::getName)
                .collect(Collectors.toList());
        System.out.println(allNames);

        int maxId = obj.stream()
                .mapToInt(ObjectList::getId)
                .max().orElseThrow(() -> new Exception("Illegal Id"));
        System.out.println(maxId);

        int haveLetter = obj.stream()
                .filter(s -> s.getName().toLowerCase().contains("а"))
                .mapToInt(ObjectList::getCount)
                .sum();
        System.out.println(haveLetter);

        Map<Integer, String> map = obj.stream()
                .collect(Collectors.toMap(ObjectList::getId, ObjectList::getName));
        System.out.println(map);
    }
}
