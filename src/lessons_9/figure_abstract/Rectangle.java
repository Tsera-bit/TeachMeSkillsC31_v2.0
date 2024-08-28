package lessons_9.figure_abstract;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    Rectangle() {
        this.sideA = Math.random() * 10;
        this.sideB = Math.random() * 10;
    }

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double area() {
        return sideA * sideB;
    }

    @Override
    double perimeter() {
        return 2 * sideA + 2 * sideB;
    }

    public void setSideAB(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
