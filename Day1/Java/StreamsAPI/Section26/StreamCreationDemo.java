package Day1.Java.StreamsAPI.Section26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> depStream = departmentList.stream();
        //depStream.forEach(department -> System.out.println(department));
        // Using method reference
        depStream.forEach(System.out::println);

    }
}
