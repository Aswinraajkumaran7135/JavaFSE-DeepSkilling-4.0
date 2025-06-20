public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");

        // Image will be loaded from disk
        image.display();
        System.out.println("");

        // Image will NOT be loaded from disk again
        image.display();
    }
}