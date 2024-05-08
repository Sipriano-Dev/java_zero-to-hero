public class InternMethodDemo {

    public static void main(String[] args) {
        String hello = "Hello";
        //String obj = new String("Hello");//Comparing will be different
        String obj = new String("Hello").intern();//Will be equal

        System.out.println(hello==obj);
    }

}
