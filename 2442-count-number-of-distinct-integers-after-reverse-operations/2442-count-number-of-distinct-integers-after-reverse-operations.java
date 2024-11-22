class Solution {
    public int countDistinctIntegers(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);

        // Reverse the number directly
        int reversed = 0, temp = num;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        set.add(reversed);
    }
    return set.size();
    }
}