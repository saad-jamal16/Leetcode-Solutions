class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] c = new int[n];
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!set.add(A[i])){
                count++;
            }
            if(!set.add(B[i])){
                count++;
            }
            c[i] = count;
        }
        return c;
    }
}