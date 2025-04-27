class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> counterS = new HashMap<>();
        Map<Character,Integer> counterT = new HashMap<>();
        
        for(char c : s.toCharArray()){
            counterS.put(c, counterS.getOrDefault(c,0) +1);
        }
        for(char c : t.toCharArray()){
            counterT.put(c,counterT.getOrDefault(c,0) +1);
        }
        return  counterS.equals(counterT);
    }
}