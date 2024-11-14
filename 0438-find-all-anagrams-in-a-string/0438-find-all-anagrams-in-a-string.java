class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //created two array with 26 size
      int freq1[] = new int[26];
      int freq2[] = new int[26];
      List<Integer> list = new ArrayList<>();
    
    if(s.length()<p.length())
        return list;
    
    for(int i=0; i<p.length(); i++){
        freq1[s.charAt(i)-'a']++;
        freq2[p.charAt(i)-'a']++;
    }
 
    int start=0;
    int end=p.length(); //end is inialized as p's length
    
    if(Arrays.equals(freq1,freq2))
        list.add(start);    //if freq1 and freq2 are equal it will be added to the list
    
    while(end<s.length()){   
        
        freq1[s.charAt(start)-'a']--;
        freq1[s.charAt(end)-'a']++;
        
        if(Arrays.equals(freq1,freq2))
        list.add(start+1);
        
        start++;
        end++;
    }
  return list;
    }
}