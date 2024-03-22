package array;

public class RemoveElement {
    private int repeated = 0;
    private int lastNotEqualToVal = 0;
    public int removeElement(int[] nums, int val) {
        int numsSize = nums.length;
        for (int i = 0; i < numsSize; i++) {
            if (nums[i] == val){
                repeated++;
            } else {
                nums[lastNotEqualToVal] = nums[i];
                lastNotEqualToVal = lastNotEqualToVal + 1;
            }
        }
        return numsSize - repeated;
    }
}