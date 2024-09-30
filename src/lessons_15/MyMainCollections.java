package lessons_15;

import java.util.*;

public class MyMainCollections {
    public static void main(String[] args) {
        // task1 --------------------------------------
        collectionSetTypeTask1();
        // task2 --------------------------------------
        AnimalName Animals = new AnimalName();
        Animals.addAnimal("Tiger");
        Animals.addAnimal("Rabbit");
        Animals.deleteAnimal();
        Animals.addAnimal("Cat");
        Animals.addAnimal("Dog", "Bear");
        Animals.showAnimals();
        System.out.println();
        // task3 --------------------------------------
        ArrayList<Student> students = new ArrayList<>();
        for (int counter = 0; counter < 11; counter++) {
            students.add(new Student());
        }
        for (Student student : students) {
            System.out.println(student);
        }
        gradeCheck(students);
        printStudent(students, 3);
        System.out.println();
        // taskStar ------------------------------------
        MyGeneric<Integer> myInteger = new MyGeneric<>();
        for (int i = 0, number = 152; i < 6; i++) {
            myInteger.add(number++);
        }
        System.out.println(myInteger.sizeArray());
        myInteger.remove(4);
        System.out.println(myInteger);
        if(myInteger.contains(153)) {
            System.out.println(myInteger.get(1));
        }
        myInteger.clear();
        System.out.println(myInteger);
        for (int i = 0; i <16; i++) {
            myInteger.add(i);
        }
        System.out.println(myInteger);



    }
    // используем коллекции типа set что бы избежать повторов
    static void collectionSetTypeTask1() {
        System.out.print("Введите числа через запятую: ");
        String input = (new Scanner(System.in)).nextLine();
        String[] arrayNum = input.split("[,\\s]+");

        Set<String> numSet = new LinkedHashSet<String>();

        numSet.addAll(Arrays.asList(arrayNum));

        System.out.println("Вывод без повторов: " + numSet);
    }
    // проверяем последовательно значения коллекции и обрабатываем согласно условиям
    static void gradeCheck(List<Student> students) {
        for (int counter = 0; counter < students.size(); counter++) {
            if (students.get(counter).getGrades() < 3) {
                students.remove(counter);
            } else {
                students.get(counter).iterationCourse();
            }
        }
    }
    // вывод имена студентов которые обучаются на данном курсе
    static void printStudent(List<Student> students, int course) {
        System.out.println("Студенты учащиеся на " + course + " курсе");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
