public class Car {

    String model;
    String color;
    int horsePower;
    static final byte NU_OF_WHEELS = 4; //Constant final
    static byte nuOfEngines;

    //Although it's a main, it'll not be initialized first, the static block will
    public static void main(String[] args) {
        System.out.println("main in the same class");
    }

    //static initialization block to initialize a complex static var
    static {
        nuOfEngines = 1;
        System.out.println("Static initialization block is being executed...");
    }

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
