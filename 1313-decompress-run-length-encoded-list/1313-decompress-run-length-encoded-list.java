class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();  //empty list result to store the decompressed elements.
        
        for (int i = 0; i < nums.length; i += 2) { //Iterate through nums with a step of 2 to get the pairs [freq, val]
            int freq = nums[i];   
            int val = nums[i + 1];
            
            for (int j = 0; j < freq; j++) {
                result.add(val);
            }
        }
        
        // Converting List<Integer> to int[]
        int[] decompressedArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            decompressedArray[i] = result.get(i);
        }
        
        return decompressedArray;
    }
}
