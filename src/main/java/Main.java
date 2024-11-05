import java.util.stream.Stream;
import static funcional.Challenge01.atIndex;

public class Main {
    public static void main(String[] args) {
        String[] emails = {"simon.morgan@northcoders.com", "chris.ward@northcoders.com", "info@stackoverflow.com",
                "hannah.montana@mileycyrus.com"};

        Stream.of(emails).forEach(atIndex);
    }
}
