import array.MajorityElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @Test
    public void test1(){
        MajorityElement majorityElement = new MajorityElement();
        int solution = majorityElement.majorityElement(new int[]{6,5,5});
        assertEquals(2, solution);
    }
}
