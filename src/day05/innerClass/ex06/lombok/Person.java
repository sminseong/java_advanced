package day05.innerClass.ex06.lombok;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor()
@Data
public class Person {
    private String name;
    private String age;
    private String gender;
    private String job;
    private String address;
}
