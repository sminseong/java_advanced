package day01.carTest;

public class SportsCar extends Car{

    public SportsCar (int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp() {
        this.speed+=10;
    }

    @Override
    public String toString() {
        return "현재 스피드는 " + this.speed;
    }
}
