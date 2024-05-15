public class FactorialDoWhile {

    public static void main(String[] args) {


        System.out.println(calculateFactorial(4));
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        int number = 1;

        do {
            factorial *= number++;
            n--;
        } while (n > 0);

        return factorial;

    }
}
