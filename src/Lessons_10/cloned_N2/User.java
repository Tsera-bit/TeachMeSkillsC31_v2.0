package Lessons_10.cloned_N2;

import java.util.Arrays;
import java.util.Objects;

class User implements Cloneable {
    private int id;
    private String name;
    private Country country;
    private int[] numbers;

    User(int id, String name, Country country, int... numbers) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.numbers = numbers;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object cloneDeep() throws CloneNotSupportedException {
        User cloned = (User) super.clone();
        cloned.country = (Country) country.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) &&
                Objects.equals(country, user.country) && Objects.deepEquals(numbers, user.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, Arrays.hashCode(numbers));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
