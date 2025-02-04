package day01.다형성02;

public abstract class Content {
    private String title;
    private int price;

    public Content() {}

    public Content(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void totalPrice();

    public void show() {
        System.out.println(this.title + " 비디오의 가격은 " + this.price + "원 입니다.");
    }
}
