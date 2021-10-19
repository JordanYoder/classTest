public class Car {
    private int year;
    private String make;
    private String model;
    boolean thirtyYearWarranty;

    public Car() {
        thirtyYearWarranty = false;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(int year, String make, String model) {
        this(make, model);
        this.year = year;
    }

    public Car(boolean thirtyYearWarranty, int year, String make, String model) {
        this(year, make, model);
        this.thirtyYearWarranty = thirtyYearWarranty;
    }

    public void setThirtyYearWarranty(boolean thirtyYearWarranty) {
        this.thirtyYearWarranty = thirtyYearWarranty;
    }

    public void printData() {
        System.out.println();
        System.out.println(" This car is a " + year + " " + make + " " + model);

        if (thirtyYearWarranty == true) {
            System.out.println("This  car comes with a thirty year warranty");
        } else {
            System.out.println("This car does not come with a thirty year warranty");
        }
        System.out.println("-----------------------------------------------------");
    }
}
