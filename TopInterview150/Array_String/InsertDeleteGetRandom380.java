package Array_String;

import java.util.*;

public class InsertDeleteGetRandom380 {
    // first approach was to use hashSet which is not possible to call random element
    // second approach was to use hashmap that the key is val and the value is index
    // was not able to implement getRandom.. :(
    // get a hint to use list instead of using index integer
    // in list, switch the removed index with the last and remove the last one
    Map<Integer, Integer> m;
    List<Integer> index;

    public InsertDeleteGetRandom380() {
        this.m = new HashMap<>();
        this.index = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (!m.containsKey(val)) {
            index.add(val);
            m.put(val, index.size() - 1);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (m.containsKey(val)) {
            index.set(m.get(val), index.get(index.size() - 1)); // switch the removed one with the last
            m.put(index.get(m.get(val)), m.get(val));
            index.remove(index.size() - 1); // remove the end
            m.remove(val);
            return true;
        }
        return false;

//        if (m.containsKey(val)) {
//            m.remove(val);
//            return true;
//        }
//        return false;
    }

    public int getRandom() {
        Random random = new Random();
        return index.get(random.nextInt(index.size()));
    }

    public static void main(String[] args) {
        InsertDeleteGetRandom380 randomizedSet = new InsertDeleteGetRandom380();
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }
}
