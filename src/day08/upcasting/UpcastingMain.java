package day08.upcasting;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class UpcastingMain {
    public static void main(String[] args) {
        Collection<Number> data1 = new ArrayDeque<>();
        data1.add(1);
        Collection<Number> data2 = new HashSet<>();
        data2.add(1);
        Collection<Number> data3 = new LinkedList<>();
        data3.add(1);

    }
}
