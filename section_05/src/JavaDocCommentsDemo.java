/**
 * This is a sample class to show demo about javadoc
 *
 *<p>
 *     This is a sample demo of <b>paragraph</b>
 *</p>
 *
 * @author Anderson Sipriano
 * @since 1.0
 * @see MultilineCommentDemo
 */
public class JavaDocCommentsDemo {

    public static void main(String[] args) {

    }


    /**
     * take two {@code int} numbers as input
     * and add them
     * <p>
     *     For example <b>3 + 2 = 5</b>
     * </p>
     * @param num1 represent first number
     * @param num2 represent second number
     * @return sum value of first and second number
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
