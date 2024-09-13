package lessons_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyMain {
    public static void main(String[] args) {
        String text;
        text = "рандомный текст 5463-1234-34 который содержит пару Email Blabla@mail.com " +
                "и несколько документов 3456-3456-34 3453-3453-44 и не одного номера +(44)5647896 телефона";
        //text = new Scanner(System.in).nextLine();

        HWT1();
        HWTS(text);
    }
    static void HWT1() {
        System.out.print("Введите строку: ");
        String input = new Scanner(System.in).nextLine();
        System.out.println();

        // единицы добавлены для понимания, понимание, где метод, где имя
        // сохраняем шаблон
        Pattern pattern1 = Pattern.compile("\\b[A-Z]{2,6}\\b");
        // создаём объект Matcher c строкой и шаблоном, в дальнейшем мы работаем с ними с помощью методов
        Matcher matcher1 = pattern1.matcher(input);

        // пошагово проходим по строке и проверяем каждое слово по порядку(условно)
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }

    static void HWTS(String text) {
         // создаём паттерны
         Pattern dockN = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
         Pattern email = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
         Pattern phone = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");

         Matcher matcher = email.matcher(text);

         if(matcher.find()) {
             System.out.print("email: " + matcher.group() + "\n");
         }

         Matcher matcher2 = dockN.matcher(text);

         System.out.print("document number: ");
         while(matcher2.find()) {
             System.out.print(matcher2.group());
             System.out.println();
         }

         Matcher matcher3 = phone.matcher(text);

         if (matcher3.find()) {
             System.out.println("phone: " + matcher3.group() + "\n");
         }
    }
}
