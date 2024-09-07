package Lessons_11;

import java.util.Arrays;
import java.util.Scanner;

class MyMain {
    public static void main(String[] args) {

        //task1ShortLongString(inputString());
        //task2OrderedString(inputString());
        //task3ShorterThanAverageLength(inputString());
        //task4WordSearch(inputString());
        task5DoubleLettersInWord(new Scanner(System.in).nextLine());
    }
    // ввод строк в консоль
    static String[] inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строки: ");
        return new String[] {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
    }
    // определяет самую длинную и короткую строку из заданных
    static void task1ShortLongString(String... inputStrings) {
        String shortString = inputStrings[0];
        String longString = inputStrings[0];

        for (String myString : inputStrings) {
            shortString = myString.length() < shortString.length() ? myString : shortString;
            longString = myString.length() > longString.length() ? myString : longString;
        }

        System.out.println("Short string of " + shortString.length() + " of characters:\n" + shortString);
        System.out.println("Long string of " + longString.length() + " of characters:\n" + longString);
        System.out.println("---------------------------------------------------------------------");
    }
    // выводит заданные строки в порядке возрастания
    static void task2OrderedString(String... inputStrings) {
        // вводим новый массив, чтобы не влиять на изначальный
        String[] myArrayString = Arrays.copyOf(inputStrings, inputStrings.length);
        // сортировка пузырьком
        for (int i = 0; i < myArrayString.length - 1; i++) {
            for (int j = 0; j < myArrayString.length - 1 - i; j++) {
                // Сравниваем строки
                if (myArrayString[j].compareTo(inputStrings[j + 1]) > 0) {
                    // Меняем местами, если порядок неправильный
                    String temp = myArrayString[j];
                    myArrayString[j] = myArrayString[j + 1];
                    myArrayString[j + 1] = temp;
                }
            }
        }
        // Вывод отсортированных строк
        System.out.println("Отсортированные строки:");
        for (String str : myArrayString) {
            System.out.println(str);
        }
        System.out.println("---------------------------------------------------------------------");
    }
    // выводит строки длиной меньше средней длины заданных строк.
    static void task3ShorterThanAverageLength(String... inputString) {
        int myLength = 0;
        int counter = 0;
        // вычисляем среднюю длину строк
        for (String myString : inputString) {
            myLength += myString.length();
            counter ++;
        }
        // выводим строки длиной меньше средней
        for (String myString : inputString) {
            if(myString.length() < (myLength / counter)) {
                System.out.println(myString + ". String length " + myString.length());
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }
    // посимвольный поиск в каждом слове
    static void task4WordSearch(String... inputString) {

        for (String myString : inputString) {
            // разделяем слова вылавливая все запятые и пробелы, а также их комбинации
            String[] str = myString.split("[,\\s]+");

            for(String word : str) {
                // проверка на совпадения
                int check = 0;
                // разбиваем слово на массив символов
                char[] charArray = word.toCharArray();
                // ищем по символьно совпадения
                // цикл сокращен на 1 шаг для избежания проверки последней буквы
                for (int counter = 0; counter < charArray.length - 1; counter++) {
                    if (word.indexOf(charArray[counter], counter + 1) != -1 ){
                        // обнуление проверки при нахождении совпадений
                        check = 0;
                        break;
                    }
                    check = 1;
                }
                // вывод слова при отсутствии совпадений
                if (check == 1) {
                    System.out.println(word);
                }
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }
    // дублируем буквы в слове
    static void task5DoubleLettersInWord(String word) {
        // создаём новую строку, StringBuilder не использован намеренно
        String doubleLetters = "";
        // разбиваем заданное слово на символы
        char[] charArray = word.toCharArray();
        for (char letter : charArray) {
            // добавляем в новую строку два символа, "" - для избежания сложение числового значения символов
            doubleLetters += letter + "" + letter;
        }
        System.out.println(doubleLetters);
    }
}
