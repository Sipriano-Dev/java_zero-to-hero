public class ArithmeticsMain {

    public static void main(String[] args) {
        int result = ArithmeticsOperations.addition(20, 5);
        System.out.println(result);
        System.out.println(ArithmeticsOperations.PI_VALUE);

        ArithmeticsOperations ao = new ArithmeticsOperations();
        int result2 = ao.sum(20, 5);
        System.out.println(result2);
        System.out.println(ao.piValue);
    }

}
