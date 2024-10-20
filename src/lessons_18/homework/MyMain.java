package lessons_18.homework;

import java.util.*;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) {
        // task 1 -----------------------------------------------------------------
        List<Integer> numbersArray = new ArrayList<>(Arrays.asList(123, 234, 345, 456, 567, 678));

        System.out.println(numbersArray.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum());
        // task 2 -----------------------------------------------------------------
        Map<Integer, String> myMap = new HashMap<>(Map.of(
                1, "Alex",
                2, "Anna",
                3, "James",
                5, "Mary",
                7, "John",
                9, "Linda",
                10, "David",
                11, "William"
        ));
        System.out.println(mySorted(myMap));

    }
    static List<String> mySorted (Map<Integer, String> myMap) {
        List<Integer> keys = List.of(1, 2, 5, 8, 9, 13);
        return myMap.entrySet().stream()
                .filter(id -> keys.contains(id.getKey()))
                .filter(name -> name.getValue().length() % 2 != 0)
                .map(name -> new StringBuilder(name.getValue()).reverse().toString())
                .collect(Collectors.toList());
    }
}
