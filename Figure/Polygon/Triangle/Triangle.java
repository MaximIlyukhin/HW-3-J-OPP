package Figure.Polygon.Triangle;

import Figure.Polygon.Polygon;

public class Triangle extends Polygon {
    public Triangle(double A, double B, double C) throws Exception {
        this.sides.add(A);
        this.sides.add(B);
        this.sides.add(C);
        if ((A + B) < C &&
                (A + C) < B &&
                (C + B) < A) {
            throw new Exception("Треугольник с такими сторонами не может существовать.");
        }
    }

    @Override
    public double area() {
        double halfP = this.perimeter() / 2;
        return Math.sqrt(
                halfP * ((halfP - this.sides.get(0)) * (halfP - this.sides.get(1)) * (halfP - this.sides.get(2))));
    }
}
