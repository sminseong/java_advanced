package day01.다형성01;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        setArea(getRadius()*getRadius()*Math.PI);
    }
}
