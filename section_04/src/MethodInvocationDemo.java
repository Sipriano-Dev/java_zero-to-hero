public class MethodInvocationDemo {

    public static void main(String[] args) {
        MethodInvocationDemo demo = new MethodInvocationDemo();
        demo.method1();
    }

    public void method1() {
        int num = 10;
        System.out.println("method 1");
        String output = method2();
        System.out.println(output);
    }

    public String method2() {
        String output = "Hello World!";
        System.out.println("method 2");
        method3("hi"); //return statement must be the last statement
        return output;
    }

    public void method3(String input) {
        System.out.println(input);
        System.out.println("method 3");
        method4(10);
    }

    public void method4(int num) {
        System.out.println(num);
        System.out.println("method 4");
    }

}
