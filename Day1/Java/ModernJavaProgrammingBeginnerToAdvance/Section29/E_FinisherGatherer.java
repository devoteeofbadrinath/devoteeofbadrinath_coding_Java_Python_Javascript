package Day1.Java.ModernJavaProgrammingBeginnerToAdvance.Section29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class E_FinisherGatherer {
    public static void main(String[] args) {
        System.out.println("Narayan");
        Gatherer<Integer, List<Integer>, List<Integer>> batchGatherer =
                Gatherer.ofSequential(ArrayList::new,
                        (buffer, item, downstream) -> {
                    buffer.add(item);
                    if (buffer.size() == 3){
                        downstream.push(new ArrayList<>(buffer));
                        buffer.clear();
                    }
                    return true;
                        }, (buffer, downstream) -> {
                    if (!buffer.isEmpty()) {
                        downstream.push(new ArrayList<>(buffer));
                    }
                        });
        var result = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .map(input -> input * 2).gather(batchGatherer).toList();
        System.out.println(result);
    }
}