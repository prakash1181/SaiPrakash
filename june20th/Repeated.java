package june20th;

import java.util.HashMap;

public class Repeated {
    public static void main(String[] args) {
        HashMap<Character, Integer> count = new HashMap<>();
        String s = "test string";
        for (int i = 0; i < s.length(); i++){
            if (count.containsKey(s.charAt(i))) {
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
            }
            else {
                count.put(s.charAt(i), 1);
            }

        }
        System.out.println(count);
}

}

