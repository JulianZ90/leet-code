import array.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void test1() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int solution = removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        assertEquals(5, solution);
    }

}
