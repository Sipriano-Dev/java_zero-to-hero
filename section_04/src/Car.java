public class Car {

    String model;
    String color;
    int horsePower;
    static final byte NU_OF_WHEELS = 4; //Constant final

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
