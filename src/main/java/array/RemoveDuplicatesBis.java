package array;

public class RemoveDuplicatesBis {
    private int lastUpdateInPlacePointer = 1;
    private int repeated = 0;

    //[0,0,1,1,1,1,2,3,3]
    //         ^
    public int removeDuplicates(int[] nums) {
        int numsSize = nums.length;
        int currentNumber = nums[0];
        int currentNumberRepetition = 1;
        for (int i = 1; i < numsSize; i++) {
            if (nums[i] == currentNumber) {
                currentNumberRepetition++;
                if (currentNumberRepetition <= 2) {
                    nums[lastUpdateInPlacePointer] = currentNumber;
                    lastUpdateInPlacePointer++;
                } else {
                    repeated++;
                }
            } else {
              currentNumber = nums[i];
              nums[lastUpdateInPlacePointer] = currentNumber;
              lastUpdateInPlacePointer++;
              currentNumberRepetition = 1;
            }
        }
        return numsSize - repeated;
    }
}