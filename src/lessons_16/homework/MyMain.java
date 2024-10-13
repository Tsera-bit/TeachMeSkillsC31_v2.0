package lessons_16.homework;

import java.util.HashMap;
import java.util.Map;

public class MyMain {
    public static void main(String[] args) {
        // task 1 -------------------------------------------------------------
        System.out.println(mapStrings(new String[]{"a", "b", "a", "c", "b"}));
        // task 2 -------------------------------------------------------------
        System.out.println(mapFirstLastLatter(new String[]{"man", "moon", "good", "night"}));
    }
    static Map<String, Boolean> mapStrings(String[] inputString) {
        // Проверка на пустой массив или null
        if ( inputString == null || inputString.length == 0) {
            return new HashMap<>();
        }
        Map<String, Boolean> stringMap = new HashMap<>();
        // Помещаем значение массива в Map, при повторном вхождение меняем значение на true
        for (String s : inputString) {
            if (stringMap.containsKey(s)) {
                stringMap.put(s, true);
            } else {
                stringMap.put(s, false);
            }
        }
        return stringMap;
    }
    static Map<String, String> mapFirstLastLatter(String[] inputString) {
        // Проверка на пустой массив или null
        if ( inputString == null || inputString.length == 0) {
            return new HashMap<>();
        }
        Map<String, String> stringMap = new HashMap<>();
        // Заполняем Map
        for (String s : inputString) {
            // Проверка на пустую строку или null
            if (s != null && !s.isEmpty()) {
                stringMap.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length()-1)));
            }
        }
        return stringMap;
    }
}

