package day07.genericEx.practice;
//2. 어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray 를 작성하세요.
public class GenericMethodEx <T> {
    public static <T> void printArray(T[] array) {
        for (T data : array) System.out.println(data);
    }

    public static void main(String[] args) {
        String[] arr = {"String", "Array"};
        Integer[] arr1 = {1, 2, 3, 4, 5};

        GenericMethodEx.printArray(arr);
        GenericMethodEx.printArray(arr1);

    }
}
