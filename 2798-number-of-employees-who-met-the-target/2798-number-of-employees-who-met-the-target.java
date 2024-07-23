class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        int count = 0;  //inialized count 0
        for(int i=0; i<n; i++){  //iterated through hours length
            if(hours[i] >= target){
                count++;       //increament the count
            }
            
        }
        return count;
        
    }
}