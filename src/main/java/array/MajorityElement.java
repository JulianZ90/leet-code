package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int majoritySize = (size / 2) + 1;
        int globalMaxRepetition = 0;
        int winner = nums[0];
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int i = 0; i <= size - 1; i++) {
            int currentNumber = nums[i];
            if (occurrences.containsKey(currentNumber)){
                int currentNumberMaxOccurrences = occurrences.get(currentNumber) + 1;
                occurrences.put(currentNumber, currentNumberMaxOccurrences);

                if (currentNumberMaxOccurrences >= majoritySize) {
                    return currentNumber;
                } else if (currentNumberMaxOccurrences >= globalMaxRepetition) {
                    globalMaxRepetition = currentNumberMaxOccurrences;
                    winner = currentNumber;
                }
            } else {
                occurrences.put(currentNumber, 1);
                if (globalMaxRepetition == 0) {
                    globalMaxRepetition++;
                    winner = currentNumber;
                }
            }
        }
        return winner;
    }
}