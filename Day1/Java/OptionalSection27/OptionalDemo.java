package Day1.Java.OptionalSection27;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {

    public static void main(String[] args) {
        String message = sayHello();
        if (message != null)
        System.out.println(message.toUpperCase());

        Optional<String> optionalMsg = sayHi();
        if(optionalMsg.isPresent())
            System.out.println(optionalMsg.get().toUpperCase());
    }

    public static String sayHello(){
        int num = new Random().nextInt();
        System.out.println(num);

        if (num%2==0)
        return "Hello World";
        else
            return null;
    }

    public static Optional<String> sayHi(){
        int num = new Random().nextInt();
        System.out.println(num);
        String msg = null;
        if (num%2==0)
            msg = "Hi World";
        return Optional.ofNullable(msg);
    }
}
