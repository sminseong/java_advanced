package boardV2.service;

import boardEx.Board;
import boardV2.dto.BoardDto;
import day01.package2.D;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BoardServiceDAO implements BoardService {
    private Map<Integer, BoardDto> boards = new HashMap<>();
    private static int boardNo = 0;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void insertBoard(BoardDto boardDto) {
        boardDto.setBno(++boardNo);
        boardDto.setBdate(new Date());
        boards.put(boardDto.getBno(), boardDto);
    }

    @Override
    public void listBoard(BoardDto boardDto) {
        System.out.println("\n[ 게시물 목록 ]");
        System.out.println("-".repeat(70));
        System.out.println("no\twriter\t\tdate\t\t\ttitle");
        System.out.println("-".repeat(70));

        for (HashMap.Entry<Integer, BoardDto> entry : boards.entrySet()) {
            boardDto = entry.getValue();
            String date = sdf.format(boardDto.getBdate());
            System.out.printf("%-4d%-10s%-15s%-30s%n", boardDto.getBno(), boardDto.getBwriter(), date, boardDto.getBtitle());
        }
        System.out.println("-".repeat(70));
    }

    @Override
    public void readBoard(int boardNo) {
        BoardDto boardDto = boards.get(boardNo);
        String date = sdf.format(boardDto.getBdate());

        System.out.println("#".repeat(30));
        System.out.println("번호: " + boardDto.getBno());
        System.out.println("제목: " + boardDto.getBtitle());
        System.out.println("내용: " + boardDto.getBcontent());
        System.out.println("작성자: " + boardDto.getBwriter());
        System.out.println("날짜: " + date);
        System.out.println("#".repeat(30));
    }

    @Override
    public void updateBoard(int boardNo, BoardDto boardDto) {
        boards.put(boardNo, boardDto);
    }

    @Override
    public void deleteBoard(int boardNo) {
        boards.remove(boardNo);
    }

    @Override
    public void clearBoard() {
        boards.clear();
    }
}
