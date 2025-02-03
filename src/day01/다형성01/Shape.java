package day01.다형성01;

public abstract class Shape {
    protected double area;
    private String name;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Shape() {}
    public void Shape(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    public void print() {
        System.out.println(getName() + "의 면적은 " + getArea());
    }
}
