package day01.다형성01;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
        calculationArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        double result = this.radius * this.radius * Math.PI;
        this.area = result;
    }
}
