class Solution {
    public String longestPalindrome(String s) {
       if (s == null || s.length() < 1) return "";
        
        int maxLength = 0;
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > maxLength) {
                    longest = substring;
                    maxLength = substring.length();
                }
            }
        }
        
        return longest;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
  