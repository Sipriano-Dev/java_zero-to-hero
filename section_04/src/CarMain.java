public class CarMain {

    static {
        System.out.println("Static block from the same class");
    }

    public static void main(String[] args) {

        System.out.println("Main method started...");
        Car car1 = new Car();
        Car car2 = new Car("Civic", "Black", 200);
        System.out.println(Car.nuOfEngines);

    }
}
