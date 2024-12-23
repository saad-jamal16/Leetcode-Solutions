class Solution {
    public int largestAltitude(int[] gain) {
         int n=gain.length;
        int[] arr=new int[n+1];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(m<arr[i])
                m=arr[i];
        }
        return m;
        
    }
}