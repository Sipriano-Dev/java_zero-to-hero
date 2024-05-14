public class BitwiseOperatorsDemo {

    public static void main(String[] args) {

        int x = 9;
        int y = ~x; // -10
        System.out.println(y);

        int x1 = 10;
        int y1 = 6;
        int z1 = x1 & y1; // 2
        System.out.println(z1);

        int z2 = x1 | y1; // 14
        System.out.println(z2);

    }

}
