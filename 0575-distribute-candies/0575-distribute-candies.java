class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int candy : candyType){
            set.add(candy);
        }
        int countCandy = set.size();
        int maxCandy = candyType.length/2;
        
        if(countCandy < maxCandy){
            return countCandy;
        }else{
            return maxCandy;
        }
    }
}