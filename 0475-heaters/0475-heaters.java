class Solution {
    public int findRadius(int[] houses, int[] heaters) {
         int max = 0;

		Arrays.sort(houses);
		Arrays.sort(heaters);

		int i = 0;

		for (int house : houses) {

			while(heaters.length - 1 > i && house >= heaters[i]) {
				i++;
			}

			int min = Math.abs(heaters[i] - house);
			min = i > 0 ? Math.min(min, Math.abs(heaters[i - 1] - house)) : min;

			max = Math.max(max, min);
		}

		return max;
    }
}