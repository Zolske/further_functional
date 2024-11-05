package funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Challenge02 {
    public static Supplier<List<String>> createEmailList = () -> List.of("simon.morgan@northcoders.com",
            "chris.ward@northcoders.com", "info@stackoverflow.com", "hannah.montanna@mileycyrus.com");
}
