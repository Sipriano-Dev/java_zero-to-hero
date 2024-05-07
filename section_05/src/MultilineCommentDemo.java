public class MultilineCommentDemo {

    /*
    Based on business requirements, the end user
    will be allowed to retry a maximum of 3 login
    attempts. Using the below constant, the same is
    going to be controlled. If the requirement changes
    , then change the bellow values.
     */
    static final int MAX_RETRY_ATTEMPTS = 3;

    public static void main(String[] args) {
        MultilineCommentDemo obj = new MultilineCommentDemo();
        double result = obj.calculateRectangleArea(24, 34);
        System.out.println(result);
    }

    /*
    This method calculates the area of the rectangle based
    on given length and width. The logic it is going to have
    is multiply two given input method arguments and returns
    the same to the caller.
     */

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

}
