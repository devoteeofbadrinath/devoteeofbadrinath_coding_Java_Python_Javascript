package Day1.Java.StreamsAPI.Section26;

import java.util.ArrayList;
import java.util.List;

public class StreamMapOperationDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        departmentList.stream()
                .map(word -> word.toUpperCase())
                .forEach(System.out::println);
    }
}
