import array.RotateArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateArrayTest {
    @Test
    public void test1(){
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1,2,3,4,5,6,7}, 3);
        assertEquals(1,1);
    }
}
