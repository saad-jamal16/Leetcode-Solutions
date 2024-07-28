class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Initialize a list to hold the merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();

        // Add the first interval to the merged list
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            // Check if the current interval overlaps with the next interval
            if (currentEnd >= nextStart) {
                // Merge the intervals by updating the end of the current interval
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, so add the next interval to the list
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }

        // Convert the list of merged intervals back to an array
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
        
    }
}