class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange,int j) {
         int ans = numBottles;
        while (numBottles >= j) {
            numBottles -= j - 1;
            j++;
            ans++;
        }
        return ans;
    }
}