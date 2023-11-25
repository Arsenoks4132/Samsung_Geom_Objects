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
        System.out.println(Arrays.toString(geometryObjects));
        Arrays.sort(geometryObjects);
        System.out.println();
        System.out.println(Arrays.toString(geometryObjects));

        System.out.println();

        System.out.println("Скейлим треугольник в 2 раза, прямоугольник в 3, а круг в 5");
        geometryObjects[0].Scale(2);
        geometryObjects[1].Scale(3);
        geometryObjects[2].Scale(5);

        System.out.println(Arrays.toString(geometryObjects));
    }
}