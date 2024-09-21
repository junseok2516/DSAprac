package Array_String;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RomantoInteger13 {
    static int romanToInt(String s) {
        Map<Character, Integer> hp = new HashMap<>();
        hp.put('I', 1);
        hp.put('V', 5);
        hp.put('X', 10);
        hp.put('L', 50);
        hp.put('C', 100);
        hp.put('D', 500);
        hp.put('M', 1000);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && hp.get(s.charAt(i)) < hp.get(s.charAt(i + 1))) {
                sum -= hp.get(s.charAt(i));
            } else {
                sum += hp.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
