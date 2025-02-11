package day07.collection.listEx;

public class Board {
    private String subject;
    private String writer;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Board(String subject, String writer, String content) {
        this.subject = subject;
        this.writer = writer;
        this.content = content;
    }
}
