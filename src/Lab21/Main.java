package Lab21;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Базовая работа с List---------------------------------------------------");
        List<String> list1 = new ArrayList<>();

        String[] array = {"one", "two", "three", "four", "five"};
        list1.addAll(Arrays.asList(array));

        List<String> list2 = new ArrayList<>(list1);

        List<String> list3 = Arrays.asList("six", "seven", "eight");

        int middleIndex = list2.size() / 2;
        list2.addAll(middleIndex, list3);

        Collections.sort(list2, Collections.reverseOrder());

        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        System.out.println(list2);

        System.out.println("Базовая работа с Set---------------------------------------------------");
        Set<String> set1 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);

        System.out.println(set2);

        System.out.println("Базовая работа с Map---------------------------------------------------");
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");

        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));

        map1.put(6, "VACATION");
        System.out.println("6th month: " + map1.get(6));

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);

        printMap(map1);
        printMap(map2);

        Map<String, Set<String>> map3 = new HashMap<>();
        Set<String> contacts1 = new HashSet<>();
        contacts1.add("555-1234");
        contacts1.add("johndoe@example.com");
        contacts1.add("johndoe");
        map3.put("John Doe", contacts1);
        Set<String> contacts2 = new HashSet<>();
        contacts2.add("555-5678");
        contacts2.add("janedoe@example.com");
        contacts2.add("janedoe");
        map3.put("Jane Doe", contacts2);
        System.out.println(map3);
    }

    private static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}