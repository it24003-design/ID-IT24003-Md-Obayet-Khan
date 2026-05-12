import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        ZoneId zone = ZoneId.of("Asia/Dhaka");

        ZonedDateTime time = ZonedDateTime.now(zone);

        System.out.println("Current Time : " + time);
    }
}
