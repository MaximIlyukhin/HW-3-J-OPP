import Figure.Circle.Circle;
import Figure.Polygon.Rectangle.Rectangle;
import Figure.Polygon.Square.Square;
import Figure.Polygon.Triangle.Triangle;

public class Program {
    public static void main(String[] args) throws Exception {
        Figures figures = new Figures();
        figures.add(new Rectangle(4, 5));
        figures.add(new Square(10));
        figures.add(new Triangle(3,4, 5));
        figures.add(new Circle(10));

        System.out.println("До сортировки:");
        figures.showAllInfo();
        System.out.println("\nПосле сортировки:");
        figures.sortyByArea();
        figures.showAllInfo();
        System.out.println("\nПосле удаления второй фигуры:");
        figures.remove(1);
        figures.showAllInfo();
        System.out.println("\nПосле замены второй фигуры на треугольник со сторонами 4, 5 и 6 :");
        figures.set(1, new Triangle(4,5, 6));
        figures.showAllInfo();
        System.out.println("\nПосле попытки добавить квадрат со стороной -10:");
        figures.set(1, new Square(-10));
    }
}