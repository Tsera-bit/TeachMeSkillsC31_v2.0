package lessons_18.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }
}
