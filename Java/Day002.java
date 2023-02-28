package Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day002 {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now.format(formatter));
    }
}
