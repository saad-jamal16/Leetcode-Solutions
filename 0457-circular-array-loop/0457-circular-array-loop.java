class Solution {
    public boolean circularArrayLoop(int[] nums) {
         if (nums.length == 1)
            return false;

        int slow;
        int fast;
        int temp;
        int k = 0;
        int n = 0;

        while (n < nums.length) {
            if (nums[n] == 0) {
                n++;
                continue;
            }

            slow = n;
            fast = n;
            temp = n;
            k = 0;

            do{
                slow = move(nums, slow);
                if ((nums[n] * nums[slow]) < 1 ) {
                    k = 0;
                    break;
                }

                temp = move(nums, fast);
                fast = move(nums, temp);

                //If temp is pointing to fast and temp and fast both equal meaning, index pointing to itself.
                if (temp == fast) {
                    k = 0;
                    break;
                }

                if ((nums[n] * nums[temp]) < 1 ) {
                    k = 0;
                    break;
                }
            
                if ((nums[n] * nums[fast]) < 1) {         
                    k = 0;
                    break;
                }

                k++;
            } while (slow != fast);

            if (k > 1){
                return true;
            }

            int steps = nums[n];
            slow = n;
            while(nums[slow] * steps > 0){
                temp = slow;
                slow = move(nums, temp);
                nums[temp] = 0;
            }
            n++;
        }

        return false;
    }

    public int move(int[] nums, int pos) {
        int next = Math.floorMod(pos + nums[pos], nums.length);
        return next;
    }
}