package Array_String;

public class LengthofLastWord58 {
    static int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        return ss[ss.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}
