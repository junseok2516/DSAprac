import java.util.LinkedList;
import java.util.List;

public class BaseballGame682 {
    public static int calPoints(String[] operations) {
        List<Integer> list = new LinkedList<>();
        int total = 0;
        for (var var : operations) {
            switch (var) {
                case "C":
                    total -= list.removeLast();
                    break;
                case "D":
                    list.add(list.getLast() * 2);
                    total += list.getLast();
                    break;
                case "+":
                    list.add(list.getLast() + list.get(list.size()-2));
                    total += list.getLast();
                    break;
                default:
                    list.add(Integer.parseInt(var));
                    total += list.getLast();
                    break;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
}
