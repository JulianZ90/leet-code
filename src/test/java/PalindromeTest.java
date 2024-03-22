import org.junit.jupiter.api.Test;
import two_pointer.ValidPalindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void test1(){
        String s =  "A man, a plan, a canal: Panama";
        boolean palindrome = new ValidPalindrome().isPalindrome(s);
        assertTrue(palindrome);
    }
    @Test
    public void test2(){
        String s =  "race a car";
        boolean palindrome = new ValidPalindrome().isPalindrome(s);
        assertFalse(palindrome);
    }
}
