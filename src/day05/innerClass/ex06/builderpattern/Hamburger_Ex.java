package day05.innerClass.ex06.builderpattern;
// 빌더패턴은 복잡한 객체를 단계적으로 생성할 수 있도록 도와주는 디자인 패턴이다.
// 옵션이나 매개변수를 가진 객체를 만들 때 유용함

public class Hamburger_Ex {
    // 필수 멤버
    private String bun;
    private String patty;
    private String drink;

    // 선택 멤버
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;

    private Hamburger_Ex(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.drink = builder.drink;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.bacon = builder.bacon;
    }
    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private String drink;

        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;
        private boolean bacon = false;

        public BurgerBuilder(String bun, String patty, String drink) {
            this.bun = bun;
            this.patty = patty;
            this.drink = drink;
        }

        public BurgerBuilder addCheese() {
            this.cheese = true;
            return this;
        }
        public BurgerBuilder addlettuce() {
            this.lettuce = true;
            return this;
        }
        public BurgerBuilder addtomato() {
            this.tomato = true;
            return this;
        }
        public BurgerBuilder addbacon() {
            this.bacon = true;
            return this;
        }
        // 핵심; 최종적으로 BurgerBuilder 객체를 반환하는 메서드를 생성
        public Hamburger_Ex build() {
            return new Hamburger_Ex(this);
        }

    } // end of inner class

    @Override
    public String toString() {
        return "Hamburger_Ex{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", drink='" + drink + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", bacon=" + bacon +
                '}';
    }
}
