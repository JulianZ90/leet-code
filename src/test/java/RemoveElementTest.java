import array.RemoveElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class RemoveElementTest {

    @Test
    public void test1() {
        RemoveElement removeElement = new RemoveElement();
        int solution = removeElement.removeElement(new int[]{3, 2, 2, 3}, 3);
        assertEquals(2, solution);
    }

    @Test
    public void test2(){
        RemoveElement removeElement = new RemoveElement();
        int solution = removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        assertEquals(5, solution);
    }
}
