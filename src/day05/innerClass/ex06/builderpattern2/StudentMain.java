package day05.innerClass.ex06.builderpattern2;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("stu123", "Kim", "computer")
                .inputAddress()
                .inputGrade()
                .inputPhoneNumber()
                .build();
        Student student1 = new Student.StudentBuilder("stu456", "Park", "computer")
                .inputAddress()
                .inputGrade()
                .inputPhoneNumber()
                .build();
        System.out.println(student);
        System.out.println(student1);
    }
}
