package day08.listEx.sorting.studentEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        student.studentInfo();
        student1.studentInfo();
        student2.studentInfo();

        List<Student> studentList = new ArrayList<>();

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        System.out.println("========================================================");
        System.out.println("학생이름 학번 국어/수학/영어 총점 평균");
        for (Student data : studentList) {
            System.out.printf("%s  %d %s %d %.1f%n", data.getName(), data.getSno(), data.getScores(), data.getTotal(), data.getAverage());
        }

        Collections.sort(studentList);

        System.out.println("========================================================");
        System.out.println("학생이름 학번 국어/수학/영어 총점 평균");
        for (Student data : studentList) {
            System.out.printf("%s  %d %s %d %.1f%n", data.getName(), data.getSno(), data.getScores(), data.getTotal(), data.getAverage());
        }
    }
}
