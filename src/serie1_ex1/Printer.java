package serie1_ex1;

import java.util.ArrayList;

public class Printer {
    private boolean state = false;
    private int sheet;
    ArrayList<Sheet> printedQueue;

    public Printer() {
        this.printedQueue = new ArrayList<Sheet>();
    }
    public Printer(boolean state, int sheet) {
        this.state = state;
        this.sheet = sheet;
        this.printedQueue = new ArrayList<Sheet>();
    }

    public void turnOn() {
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }

    public boolean getStatus() {
        return this.state;
    }

    public int getNumberOfSheet() {
        return this.sheet;
    }

    public void fillSheet(int quantity) {
        this.sheet = quantity;
    }

    public void print(Sheet content) {
        if (this.state && this.sheet >= 1) {
            printedQueue.add(content);
        } else {
            System.out.println("You must turn the printer on before printing!");
        }
    }

    public void ejectPrintedPaper() {
        if (state) {
            for(Sheet sheet : this.printedQueue) {
                System.out.println(sheet.getText());
            }
        } else {
            System.out.println("You must turn the printer on to get your paper!");
        }

    }
}
