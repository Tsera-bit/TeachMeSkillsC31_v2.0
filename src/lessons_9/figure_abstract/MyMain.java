package lessons_9.figure_abstract;

public class MyMain {
    public static void main(String[] args) {
        Figure[] arrayFigure = new Figure[]{
                new Circle(8),
                new Triangle(),
                new Rectangle(5, 7),
                new Circle(),
                new Rectangle()
        };
        System.out.print("Сумма периметров фигур массива: ");
        System.out.println(getSumPerimeterArray(arrayFigure));
    }
    // возвращает сумму периметров объектов массива
    static double getSumPerimeterArray(Figure[] arrayFigure) {
        double sum = 0;
        for (int counter = 0; counter < arrayFigure.length; counter++) {
            sum += arrayFigure[counter].perimeter();
        }
        return sum;
    }
}
