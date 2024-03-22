import array.RemoveDuplicatesBis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesBisTest {

    @Test
    public void test1() {
        RemoveDuplicatesBis removeDuplicates = new RemoveDuplicatesBis();
        int solution = removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
        assertEquals(5, solution);
    }

}
