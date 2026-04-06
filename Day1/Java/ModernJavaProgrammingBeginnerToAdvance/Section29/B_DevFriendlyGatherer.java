package Day1.Java.ModernJavaProgrammingBeginnerToAdvance.Section29;

import java.util.List;
import java.util.stream.Gatherer;

import static java.util.stream.Collectors.toList;

public class B_DevFriendlyGatherer {

    public static void main(String[] args) {
        var strings = List.of("One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
        Gatherer<String,?, String> gatherer = Gatherer.of(
                (state, element, downstream) -> downstream.push(element.toUpperCase()));
        var result = strings.stream().gather(Gatherer.of(
                (state, element, downstream) -> downstream.push(element.toLowerCase()))).toList();
        System.out.println(result);
    }
}
