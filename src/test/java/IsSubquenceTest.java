import org.junit.jupiter.api.Test;
import two_pointer.IsSubsequence;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubquenceTest {

    @Test
    public void test1(){
        boolean subsequence = new IsSubsequence().isSubsequence("abc", "ahbgdc");
        assertTrue(subsequence);
    }
    @Test
    public void test2(){
        boolean subsequence = new IsSubsequence().isSubsequence("axc", "ahbgdc");
        assertFalse(subsequence);
    }

}
