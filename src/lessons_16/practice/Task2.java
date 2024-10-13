package lessons_16.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, String> arrayWord = new HashMap<>();
        arrayWord.put(1111, "book");
        arrayWord.put(1122, "Tiger");
        arrayWord.put(1133, "Rabbit");
        arrayWord.put(2211, "cola");
        arrayWord.put(3311, "book");
        System.out.print("Введите слово для проверки: ");
        String word = new Scanner(System.in).nextLine();
        int counter = 0;

        for (Map.Entry<Integer, String> entry : arrayWord.entrySet()) {
            if (word.equals(entry.getValue())) {
                counter++;
            }
        }

        System.out.println("Слово: " + word + " встречается: " + counter);
    }
}
