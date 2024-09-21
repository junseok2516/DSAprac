package Array_String;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegertoRoman12 {
    static String intToRoman(int num) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1000, "M");
        m.put(900, "CM");
        m.put(500, "D");
        m.put(400, "CD");
        m.put(100, "C");
        m.put(90, "XC");
        m.put(50, "L");
        m.put(40, "XL");
        m.put(10, "X");
        m.put(9, "IX");
        m.put(5, "V");
        m.put(4, "IV");
        m.put(1, "I");
        int[] order = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String res = "";
        for (int i = 0; i < order.length; i++) {
            int tmpOp = num / order[i];
            for (int j = 0; j < tmpOp; j++) {
                res += m.get(order[i]);
            }
            num %= order[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
