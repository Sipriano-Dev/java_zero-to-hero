public class Car {

    String model;
    String color;
    int horsePower;
    static byte nuOfWheels = 4;

    //instance initialization block to avoid duplication in multiple constructor
    {
        System.out.println("Car object is being created...");
    }

    public Car() {

    }

    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void startCar() {
        System.out.println("Vehicle Started...");
    }

    public String stopCar() {
        return "Vehicle Stopped...";
    }


}
