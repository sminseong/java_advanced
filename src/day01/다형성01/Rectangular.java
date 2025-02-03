package day01.다형성01;

public class Rectangular extends Shape{
    private double width;
    private double hight;

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
        setArea(getWidth()*getHight());
    }

}
