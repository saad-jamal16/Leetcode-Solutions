class Solution {
    public int minEatingSpeed(int[] piles, int h) {
          int left = 1;
          int right = Arrays.stream(piles).max().getAsInt();

    while (left < right) {
        int mid = left + (right - left) / 2;
        int hoursNeeded = getHoursNeeded(piles, mid);

        if (hoursNeeded <= h) {
            right = mid; // Try smaller speed
        } else {
            left = mid + 1; // Increase speed
        }
    }
    return left;
}

private int getHoursNeeded(int[] piles, int K) {
    int hours = 0;
    for (int pile : piles) {
        hours += (pile + K - 1) / K; // Equivalent to Math.ceil(pile / (double) K)
    }
    return hours;
}
    }
