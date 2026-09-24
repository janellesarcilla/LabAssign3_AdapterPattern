package adapterPattern;

public class ControlApp {
    public static void main(String[] args) {
        // Create instances of the devices
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneOutlet = new SmartphoneAdapter(smartphoneCharger);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);

        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

        // Use the devices
        smartphoneOutlet.plugIn();
        refrigeratorOutlet.plugIn();
        laptopOutlet.plugIn();
    }
    
}
