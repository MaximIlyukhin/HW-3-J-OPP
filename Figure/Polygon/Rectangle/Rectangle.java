package Figure.Polygon.Rectangle;

import Figure.Polygon.Polygon;

public class Rectangle extends Polygon {
    public Rectangle(double A, double B) throws Exception {
        super(A, B);
        this.sides.add(A);
        this.sides.add(B);
    }

    @Override
    public double area() {
        return this.sides.get(0) * this.sides.get(1);
    }
}
