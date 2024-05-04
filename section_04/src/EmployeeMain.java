public class EmployeeMain {

    public static void main(String[] args) {

//      Employee employee1 = new Employee();//Setting the value in the constructor, all the instances
//      Employee employee2 = new Employee();//will hold the same value
//      employee.firstName = "John";
//      employee.lastName = "Doe";
//      employee.age = 30;
//      employee.gender = 'M';

        Employee employee1 = new Employee("John", "Doe", (byte)30, 'M');
        Employee employee2 = new Employee("Max", "Steve", (byte)25, 'F');
        Employee employee3 = new Employee();//Constructor chained

        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());

        System.out.println(employee2.getAge());
        System.out.println(employee2.getGender());

    }
}