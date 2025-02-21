package boardEx;

import java.text.SimpleDateFormat;
import java.util.*;

public class BoardExample {
    private Map<Integer, Board> boards = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    private static int boardNumber = 0;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    public void list() {
        System.out.println("\n[ 게시물 목록 ]");
        System.out.println("-".repeat(70));
        System.out.println("no\twriter\t\tdate\t\t\ttitle");
        System.out.println("-".repeat(70));

        for (HashMap.Entry<Integer, Board> entry : boards.entrySet()) {
            Board board = entry.getValue();
            String date = sdf.format(board.getBdate());
            System.out.printf("%-4d%-10s%-15s%-30s%n", board.getBno(), board.getBwriter(), date, board.getBtitle());
        }
        System.out.println("-".repeat(70));

        mainMenu();
    }

    public void mainMenu() {
        while (true) {
            try {
                System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
                System.out.print("메뉴 선택: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1: create(); break;
                    case 2: read(); break;
                    case 3: clear(); break;
                    case 4: exit(); break;
                    default:
                        System.out.println("1, 2, 3, 4 중에 입력해야 합니다.");
                }
            } catch (Exception e) {
                handleInvalidInput();
            }
        }
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
        board.setBno(++boardNumber);

        while (true) {
            try {
                System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
                System.out.print("메뉴 선택: ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    boards.put(board.getBno(), board);
                    System.out.println("게시물이 저장되었습니다.");
                    list();
                } else if (choice == 2) {
                    System.out.println("취소되었습니다.");
                    list();
                } else {
                    System.out.println("1, 2 중에 입력해야 합니다.");
                }
            } catch (Exception e) {
                handleInvalidInput();
            }
        }
    }

    public void read() {
        System.out.println("\n[ 게시물 읽기 ]");
        System.out.print("bno: ");
        int bno = sc.nextInt();
        sc.nextLine();

        if (!boards.containsKey(bno)) {
            System.out.println("입력하신 bno 가 존재하지 않습니다.");
            read();
        }

        Board board = boards.get(bno);
        String date = sdf.format(board.getBdate());

        System.out.println("#".repeat(30));
        System.out.println("번호: " + board.getBno());
        System.out.println("제목: " + board.getBtitle());
        System.out.println("내용: " + board.getBcontent());
        System.out.println("작성자: " + board.getBwriter());
        System.out.println("날짜: " + date);
        System.out.println("#".repeat(30));

        while (true) {
            try {
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
                } else {
                    System.out.println("1, 2, 3 중에 입력해야합니다.");
                }
            } catch (Exception e) {
                handleInvalidInput();
            }
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

        while (true) {
            try {
                System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
                System.out.print("메뉴 선택: ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    System.out.println("게시물이 수정되었습니다.");
                    list();
                } else if (choice == 2) {
                    System.out.println("수정이 취소되었습니다.");
                    list();
                } else {
                    System.out.println("1, 2 중에 입력해야 합니다.");
                }
            } catch (Exception e) {
                handleInvalidInput();
            }
        }
    }

    public void delete(Board board) {
        boards.remove(board.getBno());
        System.out.println("해당 게시물이 삭제되었습니다.");
        list();
    }

    public void clear() {
        System.out.println("\n[ 전체 게시물 삭제 ]");

        while (true) {
            try {
                System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
                System.out.print("메뉴 선택: ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    boards.clear();
                    System.out.println("모든 게시물이 삭제되었습니다.");
                    list();
                } else if (choice == 2){
                    System.out.println("취소되었습니다.");
                    list();
                } else {
                    System.out.println("1, 2 중에 입력해야 합니다.");
                }
            } catch (Exception e) {
                handleInvalidInput();
            }
        }
    }

    public void exit() {
        System.out.println("\n프로그램을 종료합니다.");
        System.exit(0);
    }

    public void handleInvalidInput() {
        System.out.println("숫자를 입력해 주세요.");
        sc.nextLine();
    }
}