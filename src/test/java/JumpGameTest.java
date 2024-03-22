import array.JumpGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JumpGameTest {

    @Test
    public void test1() {
        JumpGame jumpGame = new JumpGame();
        boolean canJump = jumpGame.canJump(new int[]{2, 3, 1, 1, 4});
        assertTrue(canJump);
    }
    @Test
    public void test2() {
        JumpGame jumpGame = new JumpGame();
        boolean canJump = jumpGame.canJump(new int[]{3,2,1,0,4});
        assertFalse(canJump);
    }
    @Test
    public void test3() {
        JumpGame jumpGame = new JumpGame();
        boolean canJump = jumpGame.canJump(new int[]{2,5,0,0});
        assertTrue(canJump);
    }
}
