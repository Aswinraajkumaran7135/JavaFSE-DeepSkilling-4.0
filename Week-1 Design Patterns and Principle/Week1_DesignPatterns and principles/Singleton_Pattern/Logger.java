public class Logger {
    private static Logger singleObject;

    private Logger() {
        System.out.println("Logger created");
    }

    public static Logger getInstance() {
        if (singleObject == null) {
            singleObject = new Logger();
        }
        return singleObject;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}