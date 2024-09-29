package lessons_15;

import java.util.Random;

class Student {
    private String name;
    private Group group;
    private int course;
    private double grades;

    // при пустом конструкторе заполняет автоматически
    Student() {
        Random random = new Random();
        String[] names = {"Alex", "Brian", "Charles", "David", "Edward", "Frank", "George", "Henry", "Ivan", "John"};
        this.name = names[random.nextInt(names.length)];
        this.group = Group.values()[random.nextInt(Group.values().length)];
        this.course = 1 + random.nextInt(3);
        this.grades = random.nextDouble(5.0);

    }
    Student(String name, Group group, int course, int grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    // конструктор для клонирования
    Student(Student student){
        this.name = student.name;
        this.group = student.group;
        this.course = student.course;
        this.grades = student.grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + String.format("%.2f", grades) +
                '}';
    }

    double getGrades() {
        return grades;
    }

    void iterationCourse() {
        this.course++;
    }

    int getCourse() {
        return course;
    }
}
