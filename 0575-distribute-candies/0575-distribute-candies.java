class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int candy : candyType){
            set.add(candy);
        }
        int candyCount = set.size();
        int maxCandies = candyType.length/2;
        
        if(candyCount < maxCandies){
            return candyCount;
        }else{
            return maxCandies;
        }
    }
}