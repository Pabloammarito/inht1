
public class Smartphone extends Computer {
    public String brand;
    public String model;
    public int year;


        public String operatingSystem;

        public SmartPhone(String brand, String model, int year, String operatingSystem) {
            super(brand, model, year);
            this.operatingSystem = operatingSystem;
        }

        public void displayBrandAndModel() {
            System.out.println("Brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year);
        }
    }