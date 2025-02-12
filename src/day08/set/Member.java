package day08.set;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        //name과 age가 같다면 true 리턴
//        if (o instanceof Member target) {
//            return target.name.equals(name) && (target.age == age);
//        } else return ;
//    }

    @Override
    public int hashCode() {
        //name과 age 값이 같으면 동일한 hashcode가 리턴
        return name.hashCode() + age;
    }
}
