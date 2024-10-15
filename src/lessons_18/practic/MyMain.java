package lessons_18.practic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class MyMain {
    public static void main(String[] args) {
        // task 1.1 ----------------------------------------------
        User user = null;
        Optional<User> optional = Optional.ofNullable(user);
        if(optional.isEmpty()) {
            System.out.println("DEFAULT");
        } else {
            System.out.println(user.getName());
        }
        System.out.println (optional.map(User::getName).orElse("DEFAULT"));
        // task 1.2 ----------------------------------------------
        List<String>  myList = Arrays.asList("Alice", "Bob", "Charlie", "Anna");
        System.out.println(myList.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()));
        // task 1.3 ----------------------------------------------
        List<Developer> developerList = Arrays.asList(
                new Developer(12, "Alex"),
                new Developer(5, "Anna"),
                new Developer(7, "Bob"),
                new Developer(15, "Andrei")
        );
        List<Developer> tryDeveloper = developerList.stream().
                filter(dev -> dev.getId() > 10 && dev.getName().startsWith("An")).
                collect(Collectors.toList());
        System.out.println(tryDeveloper);
    }
}