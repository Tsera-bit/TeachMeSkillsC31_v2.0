package lessons_9.position_interface;

public class Worker implements Position {
    @Override
    public void positionName() {
        System.out.println("Рабочий");
    }
}
