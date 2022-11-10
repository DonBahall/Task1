interface Shape extends Comparable<Shape>{
    double getVolume();

    @Override
    default int compareTo(Shape shape) {
        return Double.compare(getVolume(), shape.getVolume());
    }
}

abstract class Radius implements Shape {
    protected double radius;

    public Radius(double radius) {
        this.radius = radius;
    }
}
class Pyramid implements Shape {
    private final double height;
    private final double foundation;

    public Pyramid(double height, double foundation) {
        this.height = height;
        this.foundation = foundation;
    }

    @Override
    public double getVolume() {
        return height * foundation * 4 / 3;
    }
}
class Ball extends Radius {

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }

    public Ball(double radius) {
        super(radius);
    }
}

class Cylinder extends Radius {

    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}



