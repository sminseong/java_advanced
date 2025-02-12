package day08.listEx.sorting.studentEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 학생 수를 입력하세요.");
        int count = sc.nextInt();

        List<Student> studentList = new ArrayList<>();

        for (int i=0; i<count; i++) {
            Student student = new Student();
            student.studentInfo();
            studentList.add(student);
        }

        System.out.println("===================정렬 전===================");
        System.out.println("학생이름 학번 국어/수학/영어 총점 평균");
        for (Student data : studentList) {
            System.out.printf("%s  %d %s %d %.1f%n", data.getName(), data.getSno(), data.getScores(), data.getTotal(), data.getAverage());
        }

        Collections.sort(studentList);

        System.out.println("===================정렬 후===================");
        System.out.println("학생이름 학번 국어/수학/영어 총점 평균");
        for (Student data : studentList) {
            System.out.printf("%s  %d %s %d %.1f%n", data.getName(), data.getSno(), data.getScores(), data.getTotal(), data.getAverage());
        }
    }
}
