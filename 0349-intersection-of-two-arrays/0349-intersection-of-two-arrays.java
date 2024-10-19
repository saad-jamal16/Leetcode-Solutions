class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        int p1 = 0;
        int p2 = 0;
        
        Set<Integer> intersection = new HashSet<>();
        while(p1 < n && p2 < m){
            if(nums1[p1] == nums2[p2]){
                intersection.add(nums1[p1]);
                p1++;
                p2++;
            }else if(nums1[p1] < nums2[p2]){
                p1++;
            }else{
                p2++;
            }
        }
        int k = intersection.size();
        int [] res = new int[k];
        int curr = 0;
        for(int x : intersection){
            res[curr++] = x;
        }
        return res;
    }
}
        
    
