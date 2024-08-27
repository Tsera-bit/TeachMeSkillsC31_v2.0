package lessons_8.TaskStar_CloseClass;

public class MyMain {
    public static void main(String[] args) {
        // !!! Дублирование информации из класса Dog !!!
        // Метод статичен он принадлежит классу Dog,
        // Его можно использовать только через имя класса Dog.eat("Meat").
        // Данным методом не может пользоваться Объект клаcса Dog,
        // name.eat("Meat") ошибка компилятор не пропустит или попросит убрать модификатор static
        Dog.eat("Meat");
        Dog.voice();
    }
}
