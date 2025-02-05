package day02.exception.Test_02;

public class CardPayment extends Payment{
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopName, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public String toString() {
        return "CardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardPassword='" + cardPassword + '\'' +
                ", monthlyInstallment=" + monthlyInstallment +
                '}';
    }
}
