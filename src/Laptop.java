
class Laptop extends Computer {
    // Additional property
    private boolean hasTouchScreen;

    // Constructor
    public Laptop(String name, int year, int storage, boolean hasTouchScreen) {
        super(name, year, storage);
        this.hasTouchScreen = hasTouchScreen;
    }

    // Additional method
    public void touchScreenInfo() {
        if (hasTouchScreen) {
            System.out.println(name + " has a touch screen");
        } else {
            System.out.println(name + " does not have a touch screen");
        }
    }
}
