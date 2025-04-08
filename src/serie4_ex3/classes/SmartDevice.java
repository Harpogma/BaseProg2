package serie4_ex3.classes;

public abstract class SmartDevice {
    private boolean isOn;

    public SmartDevice(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getStatus() {
        return this.isOn;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public abstract void performFunction();
}
