package Lessons_10.user;

import java.util.Arrays;
import java.util.Objects;

class User {
    private String name;
    private int age;
    private int[] numbers;

    User(String name, int age, int... numbers) {
        this.name = name;
        this.age = age;
        this.numbers = numbers;
    }

    User(User user) {
        this.name = user.name;
        this.age = user.age;
        this.numbers = Arrays.copyOf(user.numbers, user.numbers.length);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.deepEquals(numbers, user.numbers);
    }
}

