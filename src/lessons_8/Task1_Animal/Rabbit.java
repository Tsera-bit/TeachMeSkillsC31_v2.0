package lessons_8.Task1_Animal;

class Rabbit extends Animal{

    @Override
    void voice() {
        System.out.println("Звуки кролика");
    }

    @Override
    void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Ест травку с удовольствием");
        } else {
            System.out.println("Это он не хочет");
        }
    }
}
