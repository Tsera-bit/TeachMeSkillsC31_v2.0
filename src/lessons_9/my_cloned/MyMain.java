package lessons_9.my_cloned;

public class MyMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person alex = new Person("3245", new Address("Minsk"));
        Person julia = (Person) alex.clone();
        // Меняем значение города для проверки Deep copy
        julia.setCityAddress("Borisov");

        System.out.println(alex.getId());
        System.out.println(alex.getCityAddress());
        System.out.println("----------------------------");
        System.out.println(julia.getId());
        System.out.println(julia.getCityAddress());
    }
}
