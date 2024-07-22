import java.time.*;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime londonStartTime, londonEndTime, newYorkStartTime,newYorkEndTime;

        londonStartTime = ZonedDateTime.of(2024, 10, 15,
                14, 0, 0, 0, ZoneId.of("Europe/London"));
        londonEndTime = londonStartTime.plusHours(2);
        newYorkStartTime = londonStartTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        newYorkEndTime = newYorkStartTime.plusHours(2);

        System.out.println("Conference Call Start Time (London): " + londonStartTime);
        System.out.println("Conference Call End Time (London): " + londonEndTime);
        System.out.println("Conference Call Start Time (New York): " + newYorkStartTime);
        System.out.println("Conference Call End Time (New York): " + newYorkEndTime);
    }

}