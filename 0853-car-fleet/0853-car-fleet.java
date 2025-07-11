class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        // step 1 pair postions:
        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i])/speed[i];// time to reach target
        }
         // Step 2: Sort by position descending
        Arrays.sort(cars,(a,b) -> Double.compare(b[0],a[0]));

        // Step 3: Use stack to track fleet times
        
         Stack<Double> stack = new Stack<>();
        for(double[] car : cars){
            double time = car[1];
            if (stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();

    }
}