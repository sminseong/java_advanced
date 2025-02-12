package day08.listEx.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main1 {
    public static void main(String[] args) {

        class User {
            private String name;
            private int age;

            User(String name, int age){
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        //List 에 5명의 사용자 저장 후 정렬
        User user1 = new User("홍길동", 33);
        User user2 = new User("홍길동", 21);
        User user3 = new User("임준오", 40);
        User user4 = new User("서민성", 30);
        User user5 = new User("서민성", 26);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        Collections.sort(userList, Comparator.comparing(User::getAge));     //나이순 정렬
        for(User user : userList) System.out.println(user.name + " " + user.age + "세");

        System.out.println("=======================");

        Collections.sort(userList, Comparator.comparing(User::getName));    //이름 오름차순
        for(User user : userList) System.out.println(user.name + " " + user.age + "세");

        System.out.println("=======================");

        Collections.sort(userList, Comparator.comparing(User::getAge).thenComparing(User::getName));
        for(User user : userList) System.out.println(user.name + " " + user.age + "세");

    }
}