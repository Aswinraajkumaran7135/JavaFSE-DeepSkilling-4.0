public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.payAmount("1000");

        context.setPaymentStrategy(new PayPalPayment());
        context.payAmount("500");
    }
}