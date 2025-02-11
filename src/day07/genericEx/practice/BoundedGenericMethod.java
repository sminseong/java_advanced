package day07.genericEx.practice;
//3. Comparable<T> 를 확장하는 타입의 두 객체를 비교하는
//제너릭 메소드 compareTo를 작성하세요. 이 매서드를 이요하여 두 숫자를 비교하세요.
public class BoundedGenericMethod <T> {
    public static <T extends Comparable<T>> T compareTo (T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(BoundedGenericMethod.compareTo(5, 10));
    }
}
