import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate x = LocalDate.now();
        LocalDateTime y = LocalDateTime.now();
        Instant r = Instant.now();

        System.out.println("Data: " + x);
        System.out.println("Data e hora local: " + y);
        System.out.println("Data e hora global (Londres): " + r);

        // atribuindo direto a data e hora
        LocalDate d01 = LocalDate.parse("2024-08-09");
        LocalDateTime d02 = LocalDateTime.parse("2024-08-09T00:59:20");
        Instant d03 = Instant.parse("2024-08-09T00:59:20Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d02 = " + d02.format(fmt1));
        System.out.println("d02 = " + d02.format(fmt2));
        System.out.println("d03 = " + fmt3.format(d03));

    }
}