package serie4_ex3.classes;

public class SmartWatch extends SmartDevice {
    private int stepCount;

    public SmartWatch(boolean isOn, int stepCount) {
        super(isOn);
        this.stepCount = stepCount;
    }

    @Override
    public void performFunction() {
        stepperIncrement();
        System.out.println("Nombre de pas : " + this.stepCount);
    }

    public void stepperIncrement() {
        this.stepCount += 2;
    }
}
