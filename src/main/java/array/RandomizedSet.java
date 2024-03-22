package array;

import java.util.*;

public class RandomizedSet {

    private Map<Integer, Integer> valToIndex;
    private List<Integer> values;
    private Random rand;

    public RandomizedSet() {
        valToIndex = new HashMap<>();
        values = new ArrayList<>();
        rand = new Random();
        System.gc();
    }

    public boolean insert(int val) {
       if (!valToIndex.containsKey(val)) {
           valToIndex.put(val, values.size());
           values.add(val);
           return true;
       }
       return false;
    }

    public boolean remove(int val) {
       if (!valToIndex.containsKey(val)){
           return false;
       } else {
           Integer targetIndex = valToIndex.get(val);
           values.set(targetIndex, values.getLast());
           valToIndex.put(values.getLast(), targetIndex);
           values.removeLast();
           valToIndex.remove(val);
           return true;
       }
    }

    public int getRandom() {
        return values.get(rand.nextInt(values.size()));
    }

}
