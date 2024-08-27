package lessons_2;

class HomeWorkLessons2 {
    public static void main(String[] args) {
        HomeWorkLessons2.task1(32,45);
        HomeWorkLessons2.task2and3(12);
        HomeWorkLessons2.task2and3(444);
        HomeWorkLessons2.task4(36.7);
        HomeWorkLessons2.task5(55,13);
        HomeWorkLessons2.taskStar(123,43);
    }
    static void task1(int b, int c) {
        // Задание 1 задаём значение b и c
        int a;
        a = 4 * (b + c - 1) / 2;
        System.out.println("Задача 1: \n заданые значение b = " + b + " c = " + c);
        System.out.println(" резульат выражния \"4 * ( b + c - 1) / 2\": " + a);
    }

    static void task2and3(int number) {
        // Задание 2,3 задаём значение number
        int sum = 0;
        System.out.println("Задача 2/3: \n заданое число: " + number);
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(" сумма цифр: " + sum);
    }

    static void task4(double n) {
        // Задание 4 задаём дробное значение n
        System.out.println("Задача 4: \n заданое число: " + n);
        int intRound = (int) Math.round(n);
        System.out.println(" округлено до: " + intRound);
    }

    static void task5(int q, int w) {
        // Задание 5 задаём два натуральных числа q и w
        double sumDouble = (double) q / w;
        String result = String.format("%.3f", sumDouble);
        System.out.println("Задача 5: \n заданые значение: q = " + q + " w = " + w);
        System.out.println(" деление \"q / w\" с остатком до 3 знаков после запятой: " + result);
    }

    static void taskStar(int one, int two) {
        // Задание * задаём два значение one и two
        System.out.println("Задача *: \n задаём значение one = " + one + " two = " + two);
        one = one + two; // a = 75 b = 53
        two = one - two; // a = 75 b = 22
        one = one - two; // a = 53 b = 22
        System.out.println(" результаты ракировки one = " + one + " two = " + two);
    }
}

// git add . (DOC)
// git commit -am (All Message) "comment"
// git push (GitHub)