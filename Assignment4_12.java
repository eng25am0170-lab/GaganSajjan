class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Sedan", 2022);
        Car car2 = new Car("SUV", 2025);
        Car car3 = new Car("Hatchback", 2024);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
