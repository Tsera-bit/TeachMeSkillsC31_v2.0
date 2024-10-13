package lessons_16.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MyMain {
    public static void main(String[] args) {
        // task 1 -------------------------------------------------------------
        System.out.println(mapStrings(new String[]{"a", "b", "a", "c", "b"}));
        // task 2 -------------------------------------------------------------
        System.out.println(mapFirstLastLatter(new String[]{"man", "moon", "good", "night"}));
        // task star ----------------------------------------------------------
        taskStarBalance();
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
    // Я до конца не понял как делать это через словарь или очередь.
    // + я сразу зацепился что мне проще сделать так, и уже не смог отпустить
    static void taskStarBalance() {
        // Вводим строку после методом удаляем всё содержимое кроме строк
        System.out.print("Введите строку: ");
        String text = new Scanner(System.in).nextLine();
        String brackets = removeNonBrackets(text);
        int check = 0;
        // простая проверки на чётность, что-бы лишний раз не тратить ресурсы
        if (brackets.length() % 2 == 0) {
            char[] charArray = brackets.toCharArray();
            // проверка на соответствие скобок
            for (int counter = 0, backward = charArray.length - 1;
                 counter < charArray.length / 2; counter++, backward--) {
                if (!((charArray[counter] == '(' && charArray[backward] == ')') ||
                        (charArray[counter] == '[' && charArray[backward] == ']') ||
                        (charArray[counter] == '{' && charArray[backward] == '}'))) {
                    check = 0;
                    break;
                }
                check = 1;
            }
        }
        if (check == 1) {
            System.out.println(brackets + "- сбалансированы");
        } else {
            System.out.println(brackets + "- не сбалансирована");
        }
    }
    // Удаляем все, кроме скобок
    static String removeNonBrackets(String input) {
        return input.replaceAll("[^()\\[\\]{}]", "");
    }
}

