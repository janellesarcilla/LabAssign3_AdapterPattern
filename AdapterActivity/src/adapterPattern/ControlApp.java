package adapterPattern;

public class ControlApp {
    public static void main(String[] args) {
        // Create instances of the devices
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        Refrigerator refrigerator = new Refrigerator();
        Laptop laptop = new Laptop();

        // Use the devices
        System.out.println(smartphoneCharger.chargePhone());
        System.out.println(refrigerator.startCooling());
        System.out.println(laptop.charge());
    }
    
}
