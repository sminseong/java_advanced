package day07.genericEx.practice;
//1. 어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box 를 구현하세요. 객체를 설정하고 가져오는 메서드를 구현하세요.
public class Box <T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public boolean isOfType(Class<T> clazz) {   //받은 item 의 타입확인
        return clazz.isInstance(item);
    }

    public static void main(String[] args) {
        Box <String> boxStr = new Box<>();
        boxStr.setItem("item1");
        System.out.println(boxStr.getItem());
        System.out.println(boxStr.isOfType(String.class));

        Box <Integer> boxInt = new Box<>();
        boxInt.setItem(123);
        System.out.println(boxInt.getItem());
        System.out.println(boxInt.isOfType(Integer.class));
    }
}
