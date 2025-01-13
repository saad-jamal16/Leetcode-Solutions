class Solution {
    public int minimumLength(String s) {
      HashMap<Character, Integer> map = new HashMap<>();
        
        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int ans = 0;
        // Process each character count
        for (int count : map.values()) {
            // Add the remainder when the count is reduced by removing pairs
            while (count >= 3) {
                count -= 2;
            }
            ans += count;
        }
        
        return ans;
    }
}