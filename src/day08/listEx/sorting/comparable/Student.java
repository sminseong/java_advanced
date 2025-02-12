package day08.listEx.sorting.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {

    private int sno;    //학번
    private String name;    //이름
// 학번 정렬 후 같은 학번일 경우 이름순으로 오름차순
    @Override
    public int compareTo(Student o) {
        if (this.sno > o.sno) return 1;
        else if (this.sno == o.sno) return 0;
        else return -1;
        //return this.sno - o.sno;
    }
}
