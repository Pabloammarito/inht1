public class Computer {


        // Properties
        public String name;
        public int year;
        public int storage;

        // Constructor
        public Computer(String name, int year, int storage) {
            this.name = name;
            this.year = year;
            this.storage = storage;
        }

        // Methods
        public void computerInfo() {
            System.out.println("Name: " + name);
            System.out.println("Year: " + year);
            System.out.println("Storage: " + storage + "GB");
        }

        public void computerOnOrOff(boolean onOrOff) {
            if (onOrOff) {
                System.out.println(name + " is on");
            } else {
                System.out.println(name + " is off");
            }
        }
    }


