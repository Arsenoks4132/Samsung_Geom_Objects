import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GeometryObjects[] geometryObjects = new GeometryObjects[]{
                new Triangle(10, 25, 30),
                new Rectangle(100, 1000),
                new Circle(13)
        };
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));
    }
}