package boardEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoardExample {
    private Map<Integer, Board> boards = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("-".repeat(70));
        System.out.println("no\t\twriter\t\t\tdate\t\t\t\ttitle");
        System.out.println("-".repeat(70));

    }

    public void create(Board board) {
        System.out.println("\n[새 게시물 입력]");
        System.out.print("제목: ");
        board.setBtitle(sc.nextLine());
        System.out.print("내용: ");
        board.setBcontent(sc.nextLine());
        System.out.print("작성자: ");
        board.setBwriter(sc.nextLine());
        System.out.println("-".repeat(70));
    }

    public void read() {

    }

    public void clear() {

    }

    public void exit() {

    }

}
