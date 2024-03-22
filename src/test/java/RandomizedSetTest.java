import array.RandomizedSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomizedSetTest {

    @Test
    public void test1(){
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.remove(2);
        randomizedSet.insert(2);
        int random = randomizedSet.getRandom();
        randomizedSet.remove(1);
        randomizedSet.insert(2);
        assertEquals(2, randomizedSet.getRandom());
    }
    @Test
    public void test2(){
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(3);
        randomizedSet.insert(-2);
        randomizedSet.remove(2);
        randomizedSet.insert(1);
        randomizedSet.insert(-3);
        randomizedSet.insert(-2);
        randomizedSet.remove(-2);
        randomizedSet.remove(3);
        randomizedSet.insert(-1);
        randomizedSet.remove(-3);
        randomizedSet.insert(1);
        randomizedSet.insert(-2);
        randomizedSet.insert(-2);
        randomizedSet.insert(-2);
        randomizedSet.insert(1);
        randomizedSet.getRandom();
        randomizedSet.insert(-2);
        randomizedSet.remove(0);
        randomizedSet.insert(-3);
        randomizedSet.insert(1);

    }
}
