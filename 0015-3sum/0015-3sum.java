class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++) {
            int start = i + 1;
            int end = nums.length - 1; //inialized start and end
            
                if(i == 0 || nums[i] != nums[i-1]) {  
                    while (start < end) {       //applied the conditions
                        int cur = nums[i] + nums[start] + nums[end];   // inialized current sum added all three  pointers 
                        if(cur == 0) {
                            result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                            while(start < end && nums[start] == nums[start+1]) start++;
                            while(start < end && nums[end] == nums[end-1]) end--;
                            start++;
                            end--;
                        } else if (cur > 0){
                            end--;
                        } else{
                            start++;
                        }
                    }
                }
            }
            return result;   
        }
    }

        