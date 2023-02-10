
public class Main {

        public static void main(String[] args) {
            System.out.println("Hello world!");

            Laptop laptop = new Laptop("Dell", "Inspiron", 2020, 15.6f);
            laptop.displayBrandAndModel();
            laptop.displayScreenSize();

            SmartPhone smartphone = new SmartPhone("Apple", "iPhone", 2022, "iOS");
            smartphone.displayBrandAndModel();
            smartphone.displayOperatingSystem();


        }

    private static class SmartPhone {
        public SmartPhone(String apple, String iPhone, int i, String iOS) {
        }

        public void displayOperatingSystem() {
            
        }

        public void displayBrandAndModel() {
        }
    }
}

