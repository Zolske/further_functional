import java.util.ArrayList;
import java.util.List;

import static funcional.Challenge07.printList;
import static funcional.Challenge07.squaresNumbers;
import static funcional.Challenge08.equals;


public class Main {
    public static void main(String[] args) {
        // Challenge 1
//        String[] emails = {"simon.morgan@northcoders.com", "chris.ward@northcoders.com", "info@stackoverflow.com",
//                "hannah.montana@mileycyrus.com"};

//        Stream.of(emails).forEach(atIndex);

        // Challenge 2
//        System.out.println(createEmailList.get());

        // Challenge 3
//        Stream.of("", "Java", "Challenge", "Instruction", "1234567890").forEach(checkLength);

        // Challenge 4
//        Stream.of("simon.morgan@northcoders.com",
//                "chris.ward@northcoders.com",
//                "info@stackoverflow.com",
//                "hannah.montana@mileycyrus.com").forEach(takeUsername);

        // Challenge 5
//        greeting.accept("Albert", 39);

        // Challenge 6
//        printEachToConsole.accept(createEmailList.get());

        // Challenge 7
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(3);
        numList.add(6);
        numList.add(67);

        squaresNumbers.andThen(printList).accept(numList);

        // Challenge 8
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(1);
        list2.add(2);

        equals.accept(list1, list2);
    }
}
