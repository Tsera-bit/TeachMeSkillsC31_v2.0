package lessons_16.practice;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> accounts = new HashMap<>();
        accounts.put(1, 325);
        accounts.put(2, 584);
        accounts.put(3, 1823);
        accounts.remove(2);
        accounts.remove(3, 1823);
        accounts.get(1);
        System.out.println(accounts.keySet());
        System.out.println(accounts.values());
        System.out.println(accounts.containsValue(325));
    }
}