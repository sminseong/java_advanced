package day02.exception.Test_02;

public class CashPayment extends Payment {
    private String cashReceiptNumber;

    public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
        super(shopName, productName, productPrice);
        this.cashReceiptNumber = cashReceiptNumber;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "cashReceiptNumber='" + cashReceiptNumber + '\'' +
                '}';
    }
}
