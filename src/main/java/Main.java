import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static funcional.Challenge01.atIndex;
import static funcional.Challenge02.createEmailList;
import static funcional.Challenge03.checkLength;
import static funcional.Challenge4.takeUsername;

public class Main {
    public static void main(String[] args) {
        // Challenge 1
        String[] emails = {"simon.morgan@northcoders.com", "chris.ward@northcoders.com", "info@stackoverflow.com",
                "hannah.montana@mileycyrus.com"};

        Stream.of(emails).forEach(atIndex);

        // Challenge 2
        System.out.println(createEmailList.get());

        // Challenge 3
        Stream.of("", "Java", "Challenge", "Instruction", "1234567890").forEach(checkLength);

        // Challenge 4
        Stream.of("simon.morgan@northcoders.com",
                "chris.ward@northcoders.com",
                "info@stackoverflow.com",
                "hannah.montana@mileycyrus.com").forEach(takeUsername);


    }
}
