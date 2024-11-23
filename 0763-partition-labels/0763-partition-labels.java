class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0; i< s.length(); i++){
            map.put(s.charAt(i),i);
        }
        List<Integer> res =  new ArrayList<>();
        int curr = 0;
        int prev = 0;
        for(int i = 0; i < s.length(); i++){
            curr = Math.max(curr,map.get(s.charAt(i)));
            
            if(i==curr){
                res.add(i+1-prev);
                prev = (i+1);
            }
        }
        return res;
    }
}