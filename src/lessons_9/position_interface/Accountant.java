package lessons_9.position_interface;

public class Accountant implements Position {
    @Override
    public void positionName() {
        System.out.println("Бухгалтер");
    }
}
