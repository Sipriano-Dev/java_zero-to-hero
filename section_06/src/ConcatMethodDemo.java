public class ConcatMethodDemo {

    public static void main(String[] args) {
        String hello = "Hello";
        hello = hello + " " + "World";
        System.out.println(hello);

        String hello1 = "Hello";
        hello1 = hello1.concat(" ").concat("World");
        System.out.println(hello1);

        String emptyString = "";//has a memory location with empty String value
        String nullString = null;//does not have a memory location, has nothing
    }

}

