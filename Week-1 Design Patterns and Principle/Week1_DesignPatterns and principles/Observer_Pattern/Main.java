public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setStock("APPLE", 150.00);
        market.setStock("GOOGLE", 2800.00);
    }
}