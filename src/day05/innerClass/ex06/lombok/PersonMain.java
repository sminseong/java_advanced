package day05.innerClass.ex06.lombok;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
        person.setAddress("123");
        System.out.println(person.getAddress());
    }
}
