package boardV2.controller;

import boardV2.dto.BoardDto;
import boardV2.service.BoardService;

import java.util.Date;
import java.util.Scanner;

public class BoardController {
    BoardService boardService;
    private Scanner sc = new Scanner(System.in);

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    public void list() {
        BoardDto boardDto = new BoardDto();
        boardService.listBoard(boardDto);
    }

    public void insert() {
        BoardDto boardDto = new BoardDto();
        System.out.println("\n[ 새 게시물 입력 ]");
        System.out.print("제목: ");
        boardDto.setBtitle(sc.nextLine());
        System.out.print("내용: ");
        boardDto.setBcontent(sc.nextLine());
        System.out.print("작성자: ");
        boardDto.setBwriter(sc.nextLine());

        boardService.insertBoard(boardDto);
    }

    public void read() {
        System.out.println("\n[ 게시물 읽기 ]");
        System.out.print("bno: ");
        int boardNo = sc.nextInt();
        sc.nextLine();

        boardService.readBoard(boardNo);

        System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴 선택: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            update(boardNo);
        } else if (choice == 2) {
            delete(boardNo);
        } else if (choice == 3) {
            list();
        } else {
            System.out.println("1, 2, 3 중에 입력해야합니다.");
        }
    }

    public void update(int boardNo) {
        System.out.println("\n[ 수정 내용 입력 ]");
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();
        System.out.print("작성자: ");
        String writer = sc.nextLine();

        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            BoardDto boardDto = new BoardDto();
            boardDto.setBno(boardNo);
            boardDto.setBtitle(title);
            boardDto.setBcontent(content);
            boardDto.setBwriter(writer);
            boardDto.setBdate(new Date());
            boardService.updateBoard(boardNo, boardDto);
            System.out.println("게시물이 수정되었습니다.");
        } else if (choice == 2) {
            System.out.println("수정이 취소되었습니다.");
        } else {
            System.out.println("1, 2 중에 입력해야 합니다.");
        }
    }

    public void delete(int boardNo) {
        boardService.deleteBoard(boardNo);
    }

    public void clear() {
        System.out.println("\n[ 전체 게시물 삭제 ]");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            boardService.clearBoard();
            System.out.println("모든 게시물이 삭제되었습니다.");
        } else if (choice == 2){
            System.out.println("취소되었습니다.");
        } else {
            System.out.println("1, 2 중에 입력해야 합니다.");
        }
    }

    public void exit() {
        System.out.println("\n프로그램을 종료합니다.");
        System.exit(0);
    }

}
