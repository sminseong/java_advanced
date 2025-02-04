package day02.exception.ex02.resourceEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) {
        FileWriter file = null;
        FileWriter file2 = null;
        try {
            file = new FileWriter("data.txt");
            file.write("Java Advanced Programming1");
            file = new FileWriter("data1.txt");
            file.write("Java Advanced Programming2");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
