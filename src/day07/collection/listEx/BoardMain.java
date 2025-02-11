package day07.collection.listEx;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        //글을 보관 운영하는 ArrayList 생성
        List<Board> boardList = new ArrayList<>();

        //객체(Board)추가
        boardList.add(new Board("제목1", "ssg1", "오늘 너무 힘드네.."));
        boardList.add(new Board("제목2", "ssg2", "오늘 너무 힘드네.."));
        boardList.add(new Board("제목3", "ssg3", "오늘 너무 힘드네.."));

        //저장된 글 목록 수
        int size = boardList.size();
        System.out.println("총 글의 수: " + size);

        //특정 인덱스의 객체 가져오기
        Board board = boardList.get(1);
        System.out.printf("주제: %s  내용: %s  작성자: %s%n", board.getSubject(), board.getContent(), board.getWriter());

        //글목록
        for (Board board1 : boardList) {
            System.out.printf("주제: %s  내용: %s  작성자: %s%n", board1.getSubject(), board1.getContent(), board1.getWriter());
        }

        //글삭제
        boardList.remove(1);

        for (Board board1 : boardList) {
            System.out.printf("주제: %s  내용: %s  작성자: %s%n", board1.getSubject(), board1.getContent(), board1.getWriter());
        }
        for (int i=0; i<boardList.size(); i++) {
            System.out.printf("%d ", i);
        }
    }
}
