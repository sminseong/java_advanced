package day05.innerClass.ex06.builderpattern2;

public class Student {
    private String id;
    private String name;
    private String major;

    private String grade = "freshman";
    private String phoneNumber;
    private String address;

    private Student (StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.grade = builder.grade;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public static class StudentBuilder {
        private String id;
        private String name;
        private String major;

        private String grade = "freshman";
        private String phoneNumber;
        private String address;

        public StudentBuilder(String id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public StudentBuilder inputGrade() {
            this.grade = grade;
            return this;
        }
        public StudentBuilder inputPhoneNumber() {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public StudentBuilder inputAddress() {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
    @Override
    public String toString() {
        return "StudentBuilder{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}