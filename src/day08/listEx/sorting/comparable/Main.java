package day08.listEx.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {
    public static void main(String[] args) {

        class User implements Comparable<User>{
            String name;
            int age;

            User(String name, int age){
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }

            @Override
            public int compareTo(User o) {
//                if (this.name.charAt(0) > o.name.charAt(0))  return 1;
//                else if (this.name.charAt(0) == this.name.charAt(0)) {
//                    if (this.age > o.age)  return 1;
//                    else return -1;
//                } else  return -1;
                if (this.age > o.age) return 1;
                else if (this.age == o.age) return 0;
                else return -1;
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

        Collections.sort(userList);
        //정렬 리스트 출력
        userList.forEach(System.out::println);
        for (User user : userList) {

        }
    }
}