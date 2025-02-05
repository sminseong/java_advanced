package day03.interfaceEx.animalTest;

public class Dog extends Animal{

    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        setDistance(getDistance() + (hours * 0.5) * getSpeed());
    }
}
