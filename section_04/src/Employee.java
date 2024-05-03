public class Employee {

    String firstName;
    String lastName;
    byte age;
    char gender;

    //This way, all instances hold the same values
    public Employee() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 30;
        this.gender = 'M';
        System.out.println("Object is getting created!");
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

}
