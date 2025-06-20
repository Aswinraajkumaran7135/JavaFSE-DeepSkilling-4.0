public class Main {
    public static void main(String[] args) {
        Computer basicPC = new Computer.Builder("Intel i3", "4GB").build();
        Computer gamingPC = new Computer.Builder("Intel i7", "16GB")
                                    .setStorage("1TB SSD")
                                    .setGraphicsCard("NVIDIA RTX 3060")
                                    .build();

        System.out.println("Basic PC Specs:");
        basicPC.showSpecs();
        System.out.println();

        System.out.println("Gaming PC Specs:");
        gamingPC.showSpecs();
    }
}