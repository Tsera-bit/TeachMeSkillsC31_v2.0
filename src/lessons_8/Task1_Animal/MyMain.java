package lessons_8.Task1_Animal;

class MyMain {
    public static void main(String[] args) {

        Animal bulldog = new Dog();
        Animal katana = new Tiger();
        Rabbit snow = new Rabbit();

        bulldog.voice();
        bulldog.eat("Grass");

        katana.voice();
        katana.eat("Meat");

        snow.voice();
        snow.eat("Grass");
    }
}
