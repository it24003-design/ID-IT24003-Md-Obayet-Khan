import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String ans = now.format(f);

        System.out.println(ans);
    }
}
