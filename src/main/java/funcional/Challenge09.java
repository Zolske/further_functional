package funcional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Challenge09 {
    public static Supplier<List<String>> returnEmailList = () -> List.of("simon.morgan@northcoders.co.uk",
            "chris.ward@northcoders.biz", "info@stackoverflow.org", "hannah.montanna@mileycyrus.com");

    public static BiFunction<List<String>, String, List<String>> test = (x, y) -> x.stream().filter(z -> z.endsWith(y)).toList();

}
