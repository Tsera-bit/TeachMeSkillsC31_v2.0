package Lessons_10.user;

public class MyMain {
    public static void main(String[] args) {
        User userA = new User("Alex", 29, 1, 2, 3, 4, 5);
        User[] users = new User[] {
                new User("Alex", 29, 1, 2, 3, 4, 5),
                new User("Alex", 41, 0, 1, 2, 3, 4),
                new User(userA)
        };

        for(User user : users) {
            System.out.println(user);
            System.out.println(user.hashCode());
            System.out.println(user.equals(userA));
        }
    }
}