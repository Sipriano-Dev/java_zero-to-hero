public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.horsePower);

        Car car2 = new Car("Civic", "Black", 200);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.horsePower);

        System.out.println(Car.nuOfWheels);

    }
}
