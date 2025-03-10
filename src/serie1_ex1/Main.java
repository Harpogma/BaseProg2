package serie1_ex1;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new Printer();

        printer1.turnOn();
        printer2.turnOff();

        System.out.println("Printer 1: " + printer1.getStatus());
        System.out.println("Printer 2: " + printer2.getStatus());

        printer1.turnOn();
        System.out.println("Printer 1: " + printer1.getStatus());

        Sheet newSheet = new Sheet();
        newSheet.addTextOnPage("test");
        System.out.println("The text on the page is: " + newSheet.getText());

        printer1.fillSheet(1);
        System.out.println("Number of sheet: " + printer1.getNumberOfSheet());

        printer1.print(newSheet);

        printer1.ejectPrintedPaper();
    }
}