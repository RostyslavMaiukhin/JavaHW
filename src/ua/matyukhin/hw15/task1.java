package hw15;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
//ArrayList
        List<Integer> arrayList = new ArrayList<>();
        fillArrayList(arrayList);
        System.out.println(arrayList);
        arrayList.removeAll(arrayList);
//HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        fillHashSet(hashSet);
        System.out.println(hashSet);
        hashSet.removeAll(hashSet);
//HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        fillHashMap(hashMap);
        System.out.println(hashMap);
        for (int i = 0; i < hashMap.size() + i; i++) {
            hashMap.remove(i);
        }
//TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        fillTreeSet(treeSet);
        System.out.println(treeSet);
        treeSet.removeAll(treeSet);
//TreeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        fillTreeMap(treeMap);
        System.out.println(treeMap);
        for (int i = 0; i < treeMap.size() + i; i++) {
            treeMap.remove(i);
        }
        System.out.println(treeMap);
    }

    private static void fillArrayList(List<Integer> input) {
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
    }

    private static void fillHashSet(HashSet<Integer> input) {
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
    }

    private static void fillHashMap(HashMap<Integer, Integer> input) {
        input.put(1, 1);
        input.put(2, 2);
        input.put(3, 3);
        input.put(4, 4);
        input.put(5, 5);
    }

    private static void fillTreeSet(TreeSet<Integer> input) {
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
    }

    private static void fillTreeMap(TreeMap<Integer, Integer> input) {
        input.put(1, 1);
        input.put(2, 2);
        input.put(3, 3);
        input.put(4, 4);
        input.put(5, 5);
    }
}