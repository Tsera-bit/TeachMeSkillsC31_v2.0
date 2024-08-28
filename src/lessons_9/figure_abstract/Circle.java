package lessons_9.figure_abstract;

public class Circle extends Figure {

    private double radius;

    Circle() {
        this.radius = Math.random() * 10;
    }
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    double perimeter() {
        return Math.PI * 2 * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
