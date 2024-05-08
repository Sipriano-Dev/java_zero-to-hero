public class StringPoolDemo {

    public static void main(String[] args) {
        String hello = "Hello";
        String hi = "Hello";
        String hey = "Hey";

        System.out.println(hello == hi); //pointing to the same object on String poot
        System.out.println(hello.hashCode()); //hashcode is not memory location address
        System.out.println(hi.hashCode());
        System.out.println(hey.hashCode());


        String obj1 = new String("Hello");
        String obj2 = new String("Hello");
        String obj3 = new String("Hey");

        System.out.println(obj1 == obj2);//it is not comparing hashcode, but memory location
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());


    }
}
