class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int N = nums.length;
        int[] Ans = new int[N];
        Arrays.fill(Ans, -1);

        for (int i = 0; i < N; i++) {
            if (nums[i] == 2) continue;

            int n = nums[i];
            int pos = 0;

            while (n > 0 && ((n >> pos) & 1) == 1) {
                pos++;
            }

            if ((1 << pos) > n) {
                int highestBit = 31 - Integer.numberOfLeadingZeros(n);
                n = n & ~(1 << highestBit);
            } else {
                n = n & ~(1 << (pos - 1));
            }

            Ans[i] = n;
        }

        return Ans;

    }
}