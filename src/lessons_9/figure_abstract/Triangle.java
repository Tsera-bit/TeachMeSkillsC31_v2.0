package lessons_9.figure_abstract;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle() {
        this.sideA = Math.random() * 10;
        this.sideB = Math.random() * 10;
        this.sideC = Math.random() * 10;
    }
    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    double area() {
        return Math.sqrt(perimeter() * (perimeter() - sideA) * (perimeter() - sideB) * (perimeter() - sideC));
    }

    public void setSideABC(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
