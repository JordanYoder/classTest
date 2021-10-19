// Testing car constructors. Some values will be null for demonstration purposes.

public class CarTest {
    public static void main(String[] args) {
        Car fordFocus = new Car();
        Car hondaFit = new Car("Honda", "Fit");
        Car fordBronco75 = new Car(1975, "Ford", "Bronco");
        Car fordBronco21 = new Car(true, 1975, "Ford", "Bronco");
        Car hyundaiAccent = new Car(false, 2001, "Hyundai", "Accent");

        // Should only print warranty information
        fordFocus.printData();

        // Should print make, model, warranty information
        hondaFit.printData();
        System.out.println("Let's go ahead and purchase the extended warranty");
        hondaFit.setThirtyYearWarranty(true);
        hondaFit.printData();

        // Should print year, make, model, warranty
        fordBronco75.printData();

        // Should print warranty, year, make, model, warranty
        fordBronco21.printData();

        // Should print warranty, year, make, model, warranty
        hyundaiAccent.printData();
    }
}
