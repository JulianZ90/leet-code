import org.junit.jupiter.api.Test;
import two_pointer.TwoSum2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSum2Test {

    @Test
    public void test1(){
        int[] ints = new TwoSum2().twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1,2}, ints);
    }
    @Test
    public void test2(){
        int[] ints = new TwoSum2().twoSum(new int[]{-1,0}, -1);
        assertArrayEquals(new int[]{1,2}, ints);
    }
}
