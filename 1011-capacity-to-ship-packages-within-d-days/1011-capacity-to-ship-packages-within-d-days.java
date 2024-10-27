class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

    while (left < right) {
      final int mid = (left + right) / 2;
      if (shipDays(weights, mid) <= days)
        right = mid;
      else
        left = mid + 1;
    }
    return left;
  }

  private int shipDays(int[] weights, int shipCapacity) 
  {
    int days = 1;
    int capacity = 0;
    for (final int weight : weights) 
    {
      if (capacity + weight > shipCapacity) 
      {
        ++days;
        capacity = weight;
      } 
      else
        capacity += weight;
    }
    return days;
    }
}