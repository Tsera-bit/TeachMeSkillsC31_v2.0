package lessons_3;

import java.util.Scanner;

class HomeWorkLessons3 {
    public static void main (String[] args) {
        HomeWorkLessons3.getTask1();
        HomeWorkLessons3.getTask2();
        HomeWorkLessons3.getTask3();
        HomeWorkLessons3.getTask4();
    }
    // Метод для приостановки потока (выполнение кода), для более комфортного чтения терминала
    // Здесь используется работа с потоками и исключения
    static void ThreadSleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван.");
        }
    }

    static void getTask1() {
        int number;
        System.out.print("Введите число: ");
        number = new Scanner(System.in).nextInt();
        if(number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечётное число");
        }
        System.out.println("--------------------------------------------------------------------------------");
    }
    static void getTask2() {
        System.out.print("Температура на улице: ");
        int tempOutside = new Scanner(System.in).nextInt();
        if (tempOutside > -5) {
            System.out.println("Warn");
        } else if (tempOutside <= -5 && tempOutside > -20 ) {
            System.out.println("Normal");
        } else if (tempOutside <= -20) {
            System.out.println("Cold");
        }
        System.out.println("--------------------------------------------------------------------------------");
        // Приостановил поток на 1 секунду
        HomeWorkLessons3.ThreadSleep(1000);
        // Продолжение кода
    }
    static void getTask3() {
        System.out.println("Выводим квадрат числа");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + " в квадрате " + (int) Math.pow(i, 2));
            // Приостановил поток на 0.25 секунды
            HomeWorkLessons3.ThreadSleep(250);
            // Продолжение кода
        }
        System.out.println("--------------------------------------------------------------------------------");
    }
    static void getTask4() {
        int numberPlus7 = 0;
        while((numberPlus7 += 7) < 100) {
            System.out.print(numberPlus7 + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
    }

}