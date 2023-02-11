
class SmartPhone extends Computer {
    // Additional property
    private String operatingSystem;

    // Constructor
    public SmartPhone(String name, int year, int storage, String operatingSystem) {
        super(name, year, storage);
        this.operatingSystem = operatingSystem;
    }

    // Additional method
    public void operatingSystemInfo() {
        System.out.println(name + " runs on " + operatingSystem);
    }
}