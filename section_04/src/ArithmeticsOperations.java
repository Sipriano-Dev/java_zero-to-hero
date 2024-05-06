public class ArithmeticsOperations {

    double piValue = 3.14;
    static double PI_VALUE = 3.14;

    public int sum(int num1, int num2) {
        System.out.println(PI_VALUE);//non-static method can access static members
        return num1 + num2;
    }

    public int sumTest(int num1, int num2) {
        sum(num1, num2); //non-static method can call any members
        addition(num1, num2); //static method,
        return 0;
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int result = addition(20, 5); //as main is static, can use only static members
        System.out.println(result);
        System.out.println(PI_VALUE);

        ArithmeticsOperations ao = new ArithmeticsOperations();
        int result2 = ao.sum(20, 5); //to use non static, you have to instantiate, because non-static members are
        //connected to object not to the class
        System.out.println(result2);
        System.out.println(ao.piValue);
    }

}
