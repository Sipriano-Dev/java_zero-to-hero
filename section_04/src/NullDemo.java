public class NullDemo {

    public static void main(String[] args) {
        String myString = null;
        Employee emp = null;
        int age = emp.age; //Since is null, there's going to be a null exception
    }
}
