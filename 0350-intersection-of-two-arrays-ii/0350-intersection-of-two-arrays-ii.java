import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);  // Sort both arrays
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> resultList = new ArrayList<>(); // Using a list to collect the result dynamically
        
        int i = 0, j = 0;  // Two pointers
        
        while (i < n && j < m) {  // Traverse both arrays using two pointers
            if (nums1[i] == nums2[j]) {  // If elements are the same, add to result
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {  // Move pointer of the smaller element
                i++;
            } else {
                j++;
            }
        }
        
        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }
        
        return result;  // Return the intersection array
    }
}
