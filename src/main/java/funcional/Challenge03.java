package funcional;

import java.util.function.Consumer;

public class Challenge03 {
    public static Consumer<String> checkLength = s -> {
        if(s.length() > 5 ) {
            System.out.println( s.concat("!"));
        }
    };
}
