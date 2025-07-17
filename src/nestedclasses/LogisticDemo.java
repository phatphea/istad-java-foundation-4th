package nestedclasses;

public class LogisticDemo {
    public static void main(String[] args) {
        Logistics logistics = new Logistics();
        logistics.showTransactionStatus("success");

        logistics.showTransactionStatus("fail");

        logistics.showTransactionStatus("pending");
    }
}
