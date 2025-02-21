package boardV2.service;

import boardV2.dto.BoardDto;

public interface BoardService {
    void insertBoard(BoardDto boardDto);
    void updateBoard(int boardNo, BoardDto boardDto);
    void deleteBoard(int boardNo);
    void readBoard(int boardNo);
    void listBoard(BoardDto boardDto);
    void clearBoard();
}
