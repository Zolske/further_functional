package funcional;

import java.util.List;
import java.util.function.BiConsumer;

public class Challenge08 {
    public static BiConsumer<List<Integer>, List<Integer>>
            equals = (list1, list2) ->
    {
        if (list1.size() != list2.size()) {
            System.out.println("False");
        } else {
            for (int i = 0; i < list1.size(); i++)
                if (list1.get(i) != list2.get(i)) {
                    System.out.println("False");
                    return;
                }
            System.out.println("True");
        }
    };
}