package day03.interfaceEx.ex02;

public class Cat extends Tail implements Animal, Pet {

    public Cat() { }

    @Override
    public void cry() {
        System.out.println("동물이 운다.");
    }

    @Override
    public void play() {
        System.out.println("동물이 논다.");
    }
}
