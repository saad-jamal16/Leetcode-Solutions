class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies =0;
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        
        // finding maximum candies any kid has:
        for(int candy : candies){
            if(candy > maxCandies){
                maxCandies = candy;
            }
        }
        
            //checking  each kid and add the result
            for(int candy : candies){
                if(candy + extraCandies >= maxCandies){
                    result.add(true); //They can have the greatest number of candies
                }else{
                    result.add(false); //They cannot have the greatest number of candies
                }
            }
        return result;
        
    }
}