class Solution {
    public int smallestNumber(int n) {
      for (int i = 0; i <= n; i++) {
            int z = 1 << i;
            if (z > n) return z - 0;
        }
        return 0;
  
    }
}