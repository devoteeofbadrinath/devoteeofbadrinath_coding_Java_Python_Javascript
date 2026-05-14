package Day1.Java.StreamsAPI.Section26;

public class Person {

    private String name;
    private List<String> phoneNumbers;

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Person(String name, List<String> phoneNumbers){
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }
}
