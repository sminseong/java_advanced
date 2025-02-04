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

    public Shape() {}
    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    public void print() {
        if (this.name == "원") {
            System.out.printf("%s의 면적은 %f%n", name, area);
        } else if (this.name == "직사각형") {
            System.out.printf("%s의 면적은 %.1f%n", name, area);
        }

    }
}
