package day07.genericEx.ex03;

public class Sample {
    //제너릭 메서드
    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        printValue("Hello world");
        printValue(12345);
    }
}
