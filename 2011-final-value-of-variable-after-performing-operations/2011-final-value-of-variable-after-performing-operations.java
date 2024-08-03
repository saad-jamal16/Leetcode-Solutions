class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(operations[i].charAt(1) == '+'){
                count++;
            }else{
                count--;
            }
        }
        return count;
    }
}