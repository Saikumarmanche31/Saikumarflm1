class Car {
    // Fields (attributes)
    String type;
    String model;
    String color;

    // Constructor
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    // Method
    void displayCarDetails() {
        System.out.println("Type: " + type + ", Model: " + model + ", Color: " + color);
    }
}

public class MyCar {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car mySedan = new Car("Sedan", "Civic", "Red"); 
        mySedan.displayCarDetails(); // Call a method on the object
    }
}
