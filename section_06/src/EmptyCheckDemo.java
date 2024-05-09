public class EmptyCheckDemo {

    public static void main(String[] args) {
        String myString = "";
        boolean isEmpty = myString.isEmpty();//true
        boolean isEqualZero = myString.length()==0;//true
        boolean isEqualEmpty = "".equals(myString);//true, best way because handle with null

        String nullString = null;
        boolean isNullEmpty = "".equals(nullString);//false, but will not trows any exception, the other two would

        String blankString = "   ";
        boolean isBlankEmpty = blankString.isEmpty();//false because has spaces is not empty
        boolean isBlank = blankString.isBlank();//true because spaces is blank
    }

}
