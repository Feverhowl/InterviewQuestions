import java.util.HashMap;
import java.util.Set;

public class UniqueSimbols {

    public static void main(String[] args) {
        System.out.println(unique("Please confirm, in advance, your participation in the interview."));
        System.out.println(unique("Farevell. And if forever - Still forever farewell."));
    }

    private static Set<Character> unique(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }
        return map.keySet();
    }
}
