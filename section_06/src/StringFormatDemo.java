import java.util.ArrayList;
import java.util.List;

public class StringFormatDemo {

    public static void main(String[] args) {
        String message = "Hello %s! You have %d messages.";
        String msgForAnderson = String.format(message, "Anderson", 3);
        String msgForGabrielle = String.format(message, "Gabrielle", 6);

        String message1 = "The price is $%.2f";
        String price1 = String.format(message1, 19.99);
        String price2 = String.format(message1, 9.99);

        String message2 = "The price is $%5d"; //five white spaces before the number
        String num1 = String.format(message2, 5);
        String num2 = String.format(message2, 8);

        String message3 = "My name is %3$s, I'm %2$d years old, and I live in %1$s";
        String result = String.format(message3, "Campinas", 35, "Anderson");
    }

}
