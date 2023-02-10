

    public class Laptop extends Computer{

        public String brand;
        public String model;
        public int year;

        public float screenSize;

        public Laptop(String brand, String model, int year, float screenSize){
            super(brand, model, year);
            this.screenSize = screenSize;
        }

        public void displayBrandAndModel() {
            System.out.println("Brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year);
        }

        public void displayScreenSize () {
            System.out.println("Screen size: " + this.screenSize + " inches");
        }
    }