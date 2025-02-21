package boardV2;

import boardV2.controller.BoardController;
import boardV2.service.BoardService;
import boardV2.service.BoardServiceDAO;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        BoardService boardService = new BoardServiceDAO();
        BoardController boardController = new BoardController(boardService);
        Scanner sc = new Scanner(System.in);

        while (true) {
            boardController.list();
            System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: boardController.insert(); break;
                case 2: boardController.read(); break;
                case 3: boardController.clear(); break;
                case 4: boardController.exit(); break;
                default:
                    System.out.println("1, 2, 3, 4 중에 입력해야 합니다.");
            }
        }

    }
}
