public class Main {
    public static void main(String[] args) {
        PaymentProcessor razorpayProcessor = new RazorpayAdapter(new Razorpay());
        razorpayProcessor.processPayment(1500.00);

        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(2500.00);
    }
}