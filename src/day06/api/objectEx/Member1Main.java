package day06.api.objectEx;

public class Member1Main {
    public static void main(String[] args) {
        Member1 member1 = new Member1("shin", 25);
        System.out.println(member1.name());
        System.out.println(member1.age());
        System.out.println(member1.toString());

        Member1 member2 = new Member1("shin", 25);
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
        System.out.println(member1.equals(member2));

    }
}
