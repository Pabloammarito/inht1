public class Computer {


    public String brand;
    public String model;
    public int year;

    public  Computer (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayBrandAndModel() {
        System.out.println("Brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year);
    }

    public void displayYear() {
        System.out.println("Year: " + this.year);
    }

}
