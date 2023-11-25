public class Circle extends GeometryObjects{
    double r;

    double area = GetArea();

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void Scale(int coef) {
        this.r *= coef;
    }
    @Override
    public double GetArea() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", area=" + area +
                '}';
    }
}
