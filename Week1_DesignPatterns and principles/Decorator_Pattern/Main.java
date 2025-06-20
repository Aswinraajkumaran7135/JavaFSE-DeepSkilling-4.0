public class Main {
    public static void main(String[] args) {
        Notifier basic = new EmailNotifier();
        Notifier sms = new SMSNotifier(basic);
        Notifier full = new SlackNotifier(sms);

        full.send("Decorator pattern test message.");
    }
}