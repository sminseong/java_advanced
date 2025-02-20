package boardEx;

public class BoardMain {
    public static void main(String[] args) {
        BoardExample boardExample = new BoardExample();
        Board board = new Board();
        boardExample.list();
        boardExample.create(board);
    }
}
