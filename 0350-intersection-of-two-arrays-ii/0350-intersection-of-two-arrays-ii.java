import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);  // Sort nums2 for binary search
        
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums1) {
            int index = binarySearch(nums2, num);  // Perform binary search on nums2 for each num in nums1
            if (index != -1) {  // If element is found
                resultList.add(num);  // Add it to the result
                nums2 = removeElement(nums2, index);  // Remove the found element from nums2
            }
        }
        
        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
    
    // Binary search function
    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;  // Return the index where the element was found
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;  // Return -1 if the element is not found
    }
    
    // Function to remove element at a specific index from an array
    private int[] removeElement(int[] nums, int index) {
        int[] newArr = new int[nums.length - 1];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i != index) {
                newArr[j++] = nums[i];
            }
        }
        return newArr;
    }
}
