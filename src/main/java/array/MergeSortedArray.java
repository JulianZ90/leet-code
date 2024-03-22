package array;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexMerged = m + n - 1;
        int indexNums1 = m - 1;
        int indexNums2 = n - 1;

        while (indexNums1 >= 0 && indexNums2 >= 0) {
            if (nums1[indexNums1] > nums2[indexNums2]) {
                nums1[indexMerged] = nums1[indexNums1];
                indexNums1--;
            } else {
                nums1[indexMerged] = nums2[indexNums2];
                indexNums2--;
            }
            indexMerged--;
        }

        while (indexNums2 >= 0) {
            nums1[indexMerged] = nums2[indexNums2];
            indexNums2--;
            indexMerged--;
        }
    }
}