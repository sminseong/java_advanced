package boardEx;

import java.util.*;

public class BoardExample {
    private Map<Integer, Board> boards = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    private int boardCount = 0;

    public void list() {
        System.out.println("[ 게시물 목록 ]");
        System.out.println("-".repeat(70));
        System.out.println("no\twriter\t\tdate\t\t\t\ttitle");
        System.out.println("-".repeat(70));

        for (int key : boards.keySet()) {
            Board board = boards.get(key);
            System.out.printf("%d\t%s\t%s\t%s%n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
        }
        System.out.println("-".repeat(70));

        mainMenu();
    }

    public void create() {
        Board board = new Board();
        System.out.println("\n[ 새 게시물 입력 ]");
        System.out.print("제목: ");
        board.setBtitle(sc.nextLine());
        System.out.print("내용: ");
        board.setBcontent(sc.nextLine());
        System.out.print("작성자: ");
        board.setBwriter(sc.nextLine());
        board.setBdate(new Date());
        board.setBno(++boardCount);

        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            boards.put(board.getBno(), board);
            System.out.println("게시물이 저장되었습니다.");
        } else {
            System.out.println("취소되었습니다.");
        }
        list();
    }

    public void read() {
        System.out.println("\n[ 게시물 읽기 ]");
        System.out.print("bno: ");
        int bno = sc.nextInt();
        sc.nextLine();

        Board board = boards.get(bno);
        System.out.println("#".repeat(30));
        System.out.println("번호: " + board.getBno());
        System.out.println("제목: " + board.getBtitle());
        System.out.println("내용: " + board.getBcontent());
        System.out.println("작성자: " + board.getBwriter());
        System.out.println("날짜: " + board.getBdate());
        System.out.println("#".repeat(30));

        System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴 선택: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            update(board);
        } else if (choice == 2) {
            delete(board);
        } else if (choice == 3) {
            list();
        }
    }

    public void update(Board board) {
        System.out.println("\n[ 수정 내용 입력 ]");
        System.out.print("제목: ");
        board.setBtitle(sc.nextLine());
        System.out.print("내용: ");
        board.setBcontent(sc.nextLine());
        System.out.print("작성자: ");
        board.setBwriter(sc.nextLine());

        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.println("게시물이 수정되었습니다.");
        } else {
            System.out.println("수정이 취소되었습니다.");
        }

        list();
    }

    public void delete(Board board) {
        boards.remove(board.getBno());
        System.out.println("게시물이 삭제되었습니다.");
        list();
    }

    public void clear() {
        System.out.println("\n[ 전체 게시물 삭제 ]");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            boards.clear();
            System.out.println("모든 게시물이 삭제되었습니다.");
        } else {
            System.out.println("취소되었습니다.");
        }

        list();
    }

    public void exit() {
        System.out.println("프로그램을 종료합니다.");
        sc.close();
        System.exit(0);
    }

    public void mainMenu() {
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            create();
        } else if (choice == 2) {
            read();
        } else if (choice == 3) {
            clear();
        } else if (choice == 4) {
            exit();
        }
    }
}