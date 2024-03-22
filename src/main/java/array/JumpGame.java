package array;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0; // Initialize the maximum reachable index to 0.
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }
}
