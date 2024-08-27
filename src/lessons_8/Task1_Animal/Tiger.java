package lessons_8.Task1_Animal;

public class Tiger extends Animal {
    @Override
    void voice() {
        System.out.println("Рык");
    }

    @Override
    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Ест мясо с удовольствием");
        } else {
            System.out.println("Это он не хочет");
        }
    }
}
