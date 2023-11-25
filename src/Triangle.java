public class Triangle extends GeometryObjects {
    double a;
    double b;
    double c;

    double area = GetArea();

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void Scale(int coef) {
        this.a *= coef;
        this.b *= coef;
        this.c *= coef;
    }

    @Override
    public double GetArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + area +
                '}';
    }
}
