package day01.다형성01;

public class Rectangular extends Shape{
    private double width;
    private double hight;

    public Rectangular(double width, double hight, String name) {
        super(name);
        this.width = width;
        this.hight = hight;
        calculationArea();
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculationArea() {
        double result = this.width * this.hight;
        this.area = result;
    }

}
