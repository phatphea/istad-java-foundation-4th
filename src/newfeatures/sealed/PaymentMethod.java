package newfeatures.sealed;

public sealed interface PaymentMethod permits CreditCard, PayPal, Khqr{

    void pay(double amount);

}
