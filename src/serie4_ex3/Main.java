package serie4_ex3;

import serie4_ex3.classes.SmartDevice;
import serie4_ex3.classes.SmartPhone;
import serie4_ex3.classes.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone phone1 = new SmartPhone(true, 0);
        SmartPhone phone2 = new SmartPhone(true, 29);

        SmartWatch watch1 = new SmartWatch(true, 3456);
        SmartWatch watch2 = new SmartWatch(true, 1234);

        for (int i = 0; i < 10; i++) {
            phone1.performFunction();
            phone2.performFunction();
            watch1.performFunction();
            watch2.performFunction();
        }
    }
}
