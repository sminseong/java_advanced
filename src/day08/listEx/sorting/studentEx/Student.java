package day08.listEx.sorting.studentEx;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
public class Student implements Comparable<Student>{
    private String name;
    private int sno;
    private List<Integer> scores = new ArrayList<>();
    private int total;
    private double average;
    Scanner sc = new Scanner(System.in);

    public Student() { }
    public Student(String name, int sno, List<Integer> scores, int total, double average) {
        this.name = name;
        this.sno = sno;
        this.scores = scores;
        this.total = total;
        this.average = average;
    }

    public void studentInfo() {
        System.out.println("학생정보를 입력하세요.");
        name = sc.next();
        sno = sc.nextInt();
        scores.add(sc.nextInt());
        scores.add(sc.nextInt());
        scores.add(sc.nextInt());

        for (int score : scores) {
            total += score;
        }
        average = total / 3.0;
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.average - o.average);
    }
}
