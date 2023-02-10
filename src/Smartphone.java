
class Smartphone extends Computer {
    public String brand;
    public String model;
    public int year;


        public String operatingSystem;

    public Smartphone(String brand, String model, int year) {
        super(brand, model, year);
    }

    public void SmartPhone(String brand, String model, int year, String operatingSystem) {
            this.brand = brand;
            this.model =model;
            this.year = year;

        }

        public void displayBrandAndModel() {
            System.out.println("Brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year);
        }
    }