package lessons_9.position_interface;

public class Director implements Position {
    @Override
    public void positionName() {
        System.out.println("Директор");
    }
}
