package Day1.Java.OptionalSection27;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {
    public static void main(String[] args) {
        String message = sayHello();
        if(message != null)
            System.out.println(message.toUpperCase());

        Optional<String> optionalMsg = sayHi();
        if(!optionalMsg.isEmpty())
            System.out.println(optionalMsg.get());

        optionalMsg.ifPresent(msg -> System.out.println("ifPresent : "+ msg.toUpperCase()));
        optionalMsg.ifPresentOrElse(msg -> System.out.println("ifPresent : "+ msg.toUpperCase()),
                () -> System.out.println("Value is absent"));

        String msg1 = optionalMsg.orElse("Value is absent");
        System.out.println("orElse : " + msg1);

        String msg2 = optionalMsg.orElseGet(() -> "Value is absent");
        System.out.println("orElseGet : " + msg2);

    }

    public static String sayHello(){
        int num = new Random().nextInt();
        System.out.println(num);

        if(num % 2 == 0)
            return "Hello World";
        return null;
    }

    public static Optional<String> sayHi(){
        int num = new Random().nextInt();
        System.out.println(num);
        String msg = null;
        if(num % 2 == 0)
            msg = "Hi World";
        return Optional.ofNullable(msg);
    }
}