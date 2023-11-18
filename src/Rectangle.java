public class Rectangle extends GeometryObjects{
    double a;
    double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void Scale(int coef) {
        this.a *= coef;
        this.b *= coef;
    }
    @Override
    public double GetArea() {
        return a*b;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + GetArea() +
                '}';
    }
}
