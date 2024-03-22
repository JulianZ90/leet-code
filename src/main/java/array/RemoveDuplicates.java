package array;

public class RemoveDuplicates {
    private int repeated = 0;
    private int lastNotRepeated = 1;
    public int removeDuplicates(int[] nums) {
        int numsSize = nums.length;
        int initialNumber = nums[0];
        for (int i = 1; i < numsSize; i++) {
            if (nums[i] == initialNumber){
                repeated++;
            } else {
                nums[lastNotRepeated] = nums[i];
                initialNumber = nums[i];
                lastNotRepeated = lastNotRepeated + 1;
            }
        }
        return numsSize - repeated;
    }
}
