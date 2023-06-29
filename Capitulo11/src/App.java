
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        
       LocalDate d04 = LocalDate.parse("2022-07-20");
       LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
       Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
       
       /*Aula 14
       DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
       DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
       System.out.println("d04 = " + d04.format(fmt1));
       System.out.println("d04 = " + fmt1.format(d04));
       System.out.println("d05 = " + d05.format(fmt2));
       System.out.println("d06 = " + fmt3.format(d06));
        */

       //Aula 15
        LocalDate r1  = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2  = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
