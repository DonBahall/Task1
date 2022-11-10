import java.util.ArrayList;
import java.util.Collections;

public class Task3 {

    public static void main(String[] args) {
        Ball ball = new Ball(4);
        Cylinder cylyinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(10, 100);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(ball);
        shapes.add(cylyinder);
        shapes.add(pyramid);
        Collections.sort(shapes);
        for (Shape shape : shapes) {
            System.out.println(shape.getVolume());
        }
    }

}

