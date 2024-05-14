public class MultipleTernary {

    public static void main(String[] args) {

        System.out.println(rankCalculator(99));

    }

    public static String rankCalculator(int score) {
        String result = score < 60 ? "Beginner" : score < 70 ? "Intermediate" : score < 80 ? "Expert" : score < 90 ? "Master" : "Grandmaster";
        return result;
    }


}
