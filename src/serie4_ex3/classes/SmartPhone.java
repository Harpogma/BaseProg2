package serie4_ex3.classes;

public class SmartPhone extends SmartDevice {
    private int batteryLevel;

    public SmartPhone(boolean isOn, int batteryLevel) {
        super(isOn);
        this.batteryLevel = batteryLevel;
    }


    @Override
    public void performFunction() {
        if (super.getStatus() && this.batteryLevel > 0) {
            System.out.println("Appel en cours");
        }
    }
}
