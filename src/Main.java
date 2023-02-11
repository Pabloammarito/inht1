
public class Main {
    public static void main(String[] args) {
        // Create a Laptop object
        Laptop laptop1 = new Laptop("Lenovo", 2020, 512, true);

        // Call the methods on the Laptop object
        laptop1.computerInfo();
        laptop1.computerOnOrOff(true);
        laptop1.touchScreenInfo();

        System.out.println("");

        // Create a SmartPhone object
        SmartPhone smartphone1 = new SmartPhone("iPhone", 2022, 256, "iOS");

        // Call the methods on the SmartPhone object
        smartphone1.computerInfo();
        smartphone1.computerOnOrOff(true);
        smartphone1.operatingSystemInfo();
    }
}
