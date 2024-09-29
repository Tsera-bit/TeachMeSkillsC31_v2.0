package lessons_15;

import java.util.Arrays;
import java.util.LinkedList;

class AnimalName {
    private LinkedList<String> animal;

    AnimalName() {
        animal = new LinkedList<>();
    }

    // Добавляет переданное значение в начало коллекции
    void addAnimal(String animal) {
        this.animal.addFirst(animal);
    }
    // Перегрузка метода для передачи сразу нескольких значений
    void addAnimal(String... animals) {
        for (int counter = 0; counter < animals.length; counter++) {
            this.animal.addFirst(animals[counter]);
        }
    }
    // Удаляет последнее значение коллекции
    void deleteAnimal() {
        if (!animal.isEmpty()) {
            this.animal.removeLast();
        } else {
            System.out.println("Collection is Empty");
        }
    }
    // Выводит в консоль всех животных в коллекции
    void showAnimals() {
        System.out.println("Animals in collection " + animal);
    }
}
