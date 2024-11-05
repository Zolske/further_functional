package funcional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Challenge09 {
    public static Supplier<List<String>> returnEmailList = () -> List.of(
            "simon.morgan@northcoders.com", "chris.ward@northcoders.com", "mario@plumbing.it", "link@hyrule.co.uk",
            "shrek@duloc.com", "ellie@northcoders.js", "java@oracle.jvm", "ziggy@spidersfrommars.co.uk",
            "lemmy@motorhead.co,uk", "me@myhouse.sleep");

    public static BiFunction<List<String>, String, List<String>> test = (x, y) -> {
        if (!y.equals(".co.uk") && !y.equals(".com")) {
            return x.stream().filter(z -> !z.endsWith(".co.uk") && !z.endsWith(".com")).toList();
        }
        return x.stream().filter(z -> z.endsWith(y)).toList();
    };
}
