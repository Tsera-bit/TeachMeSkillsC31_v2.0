package lessons_17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Predicate;

public class MyMain {
    public static void main(String[] args) {
        // task 1 -----------------------------------------------------------
        calculateCentenary();
        // task 2 -----------------------------------------------------------
        filterPositiveValue(new int[]{-1, 2, 4, 6, -8, -10, 0, 32});
        // task 3 -----------------------------------------------------------
    }
    static void calculateCentenary() {
        System.out.print("Введите дату рождения в формате dd-MM-yyyy: ");
        Scanner birthday = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthdayDate = LocalDate.parse(birthday.nextLine(), formatter);
        LocalDate centenaryDate = birthdayDate.plusYears(100);

        System.out.println("Дата столетия: " + centenaryDate);
    }
    static void filterPositiveValue(int[] arrayNumbers) {
        Predicate<Integer> positiveValue = x -> x >= 0;
        StringBuilder result = new StringBuilder();
        for (int i : arrayNumbers) {
            if (positiveValue.test(i)) {
                result.append(i).append(", ");
            }
        }
        if (!result.isEmpty()) {
            result.setLength(result.length() - 2);
        }
        System.out.println("Положительными числами являются: " + result);
    }

}
