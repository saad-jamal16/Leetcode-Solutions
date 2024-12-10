class Solution {
    public int maximumLength(String s) {
    int n = s.length();
    int result = -1;

    for (int len = 1; len <= n; len++) { // Check substrings of length 1 to n
        Map<String, Integer> freqMap = new HashMap<>();

        for (int i = 0; i <= n - len; i++) {
            String substring = s.substring(i, i + len);

            // Check if substring is special
            if (substring.chars().distinct().count() == 1) {
                freqMap.put(substring, freqMap.getOrDefault(substring, 0) + 1);
            }
        }

        // Check if any substring of current length occurs at least thrice
        for (int count : freqMap.values()) {
            if (count >= 3) {
                result = len;
            }
        }
    }
    return result;
    }
}