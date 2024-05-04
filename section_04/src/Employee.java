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

    //Constructor Overloading
    public Employee(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

}
