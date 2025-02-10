package day06.api;

import com.sun.security.jgss.GSSUtil;
import day04.interfaceEx.ex04.A;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("신세종");
        Member member2 = new Member("신세종");

//        //컴퓨터적인 관점
//        System.out.println(member1 == member2);     //주소 비교 false
//        //사용자 관점
//        System.out.println(member1.equals(member2));    // Object equals() 주소값을 비교하기 때문에 false

        //객체 인스턴스 마다 각기 다른 해시코드(주소) 값을 가지기 때문이다.
        //현재, Member 클래스에서 equals()와 hashcode()를 오버라이딩 했기 때문에, 두 객체 필드 name 의 해시코드를 반환
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());

        //순수 (원래의) 객체 주소를 얻고 싶을때는,
        System.out.println(System.identityHashCode(member1));
        System.out.println(System.identityHashCode(member2));

        //리시트를 생성하고 두 객체 데이터 추가
        List<Member> members = new ArrayList<>();
        //ArrayList<Member> members1 = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        System.out.println("현재 " + members.size() + "명이 존재합니다.");

        Set<Member> members1 = new HashSet<>();
        members1.add(member1);
        members1.add(member2);
        System.out.println(members1.size());

        // Collection(HashMap, HashSet, HashTable) 은 객체가 논리적으로 같은지를 비교할때 hashcode() -> equals(

    }
}
