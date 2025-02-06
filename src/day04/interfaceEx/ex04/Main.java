package day04.interfaceEx.ex04;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        A a1 = new C();

        action(a);
        System.out.println();
        action(a1);
    }
    public static void action (A a) {
        //a.method1();
        if (a instanceof B) {
             a.method1();
        } else if (a instanceof C a1) {
            a1.method1();
            a1.method2();
        }
    }
}
