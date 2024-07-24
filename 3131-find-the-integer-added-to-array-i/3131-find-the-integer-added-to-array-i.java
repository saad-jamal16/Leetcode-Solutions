class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i=0; i<nums1.length; i++) a= Math.min(a,nums1[i]);
        for(int i=0; i<nums2.length; i++) b=Math.min(b,nums2[i]);
        return b-a;    
    }
}
