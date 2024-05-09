public class StringComparisonDemo {

    public static void main(String[] args) {
        String str1 = "Hey";
        String str2 = "Hello";
        String str3 = "Hey";

        boolean b1 = str1.equals(str2); //false
        boolean b2 = str1.equals(str3); //true

        boolean b3 = str1.equals("Hey"); //true
        boolean b4 = "Hey".equals(str3); //true
        boolean b5 = "Hey".equals("Hello"); //false
        //== compares memory locations(if obj are equal), .equals compares the value inside the object

        boolean b6 = "java".equalsIgnoreCase("JAVA");//true, if use .equals would be false

        int comparison1 = "java".compareTo("java"); //0
        int comparison2 = "java".compareTo("python"); //0
        int comparison3 = "python".compareTo("java"); //0

    }

}
