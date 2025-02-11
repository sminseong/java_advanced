package day07.reflectionEx;

import java.lang.reflect.*;

public class Person {

    public String name;
    private int age;
    public static int weight = 50;

    public Person() {}
    //이름과 나이를 입력받는 생성자
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void getField() {
        System.out.printf("이름: %s  나이: %d%n", name, age);
    }
    public int total(int left, int right) {
        return left + right;
    }
    public static int staticTotal(int left, int right) {
        return left + right;
    }
    private int privateTotal(int left, int right) {
        return left + right;
    }
}
