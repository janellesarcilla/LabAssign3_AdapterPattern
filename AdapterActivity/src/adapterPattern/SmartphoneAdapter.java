package adapterPattern;

public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public void plugIn() {
        System.out.println(smartphoneCharger.chargePhone());
    }
    
}
