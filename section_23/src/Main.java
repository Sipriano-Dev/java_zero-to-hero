import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        System.out.println(localDateOperations());
    }

    public static LocalDate localDateOperations() {
        LocalDate date = LocalDate.of(2025, 12, 25);
        LocalDate newDate = date.plusMonths(6).plusDays(18);
        return newDate;
    }

    public static LocalTime localTimeOperations() {
        LocalTime time = LocalTime.of(9, 0, 0);
        LocalTime newTime = time.plusHours(8).plusMinutes(15);
        return newTime;
    }

    public static LocalDateTime localDateTimeOperations() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 12, 25, 9, 30, 0);
        LocalDateTime newDateTime =dateTime.minusWeeks(4).minusMinutes(30);
        return newDateTime;
    }


}