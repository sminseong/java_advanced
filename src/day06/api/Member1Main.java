package day06.api;

public class Member1Main {
    public static void main(String[] args) {
        Member1 member1 = new Member1("shin", 25);
        System.out.println(member1.name());
        System.out.println(member1.age());
        System.out.println(member1.toString());
    }
}
