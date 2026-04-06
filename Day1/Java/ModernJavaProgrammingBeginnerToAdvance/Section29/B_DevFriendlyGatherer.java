package Day1.Java.ModernJavaProgrammingBeginnerToAdvance.Section29;

import java.util.List;
import java.util.stream.Gatherer;

public class B_DevFriendlyGatherer {

    public static void main(String[] args) {
        var strings = List.of("one","two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        Gatherer<String,?, String> gatherer = Gatherer.of(
                (state, element, downstream) -> downstream.push(element.toUpperCase()));
        var result = strings.stream().gather(gatherer).toList();
        System.out.println(result);
    }
}
