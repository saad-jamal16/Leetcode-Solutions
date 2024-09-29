class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        // lp = leftPointer, rp = rightPointer
        int lp = 0, rp = height.length-1;
        while(lp < rp){
            int width = rp - lp;
            int ht = Math.min(height[lp],height[rp]);
            int curwater = width * ht;
            maxwater = Math.max(maxwater,curwater);
            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
        
    }
}