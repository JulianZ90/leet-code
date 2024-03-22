package array;

import java.util.Arrays;

public class HIndex {

    // [3,5,10,8,4]
    public int hIndex(int[] citations) {
        int total = Arrays.stream(citations).sum();
        int hindex = 0;
        for (int i = citations.length; i> 0 ; i--) {

            if (total >= i*citations.length){
                hindex = i;
                break;
            }
        }
        return hindex;
    }
}
