import java.time.OffsetDateTime;

public class Example11 {
    public static void main(String[] args) {
        OffsetDateTime o1=OffsetDateTime.now();
        System.out.println(o1.getDayOfMonth());
        System.out.println(o1.getDayOfYear());
        System.out.println(o1.getDayOfWeek());
        System.out.println(o1.toLocalDate());

        OffsetDateTime value=o1.minusDays(5);
        System.out.println(value);

        OffsetDateTime value1=o1.plusDays(240);
        System.out.println(value1);

    }
}
