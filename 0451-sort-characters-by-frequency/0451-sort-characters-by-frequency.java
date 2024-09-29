class Solution {
    public String frequencySort(String s) {
       // Count the occurence on each character
	HashMap<Character, Integer> freq = new HashMap<>();
	for (char c : s.toCharArray()) {
		freq.put(c, freq.getOrDefault(c, 0) + 1);
	}
	
	// Sorting
	List<Character> chars = new ArrayList(freq.keySet());
	Collections.sort(chars, (a, b) -> (freq.get(b) - freq.get(a)));

	// Build string
	StringBuilder sb = new StringBuilder();
	for (Object c : chars) {
		for (int i = 0; i < freq.get(c); i++) {
			sb.append(c);
		}
	}
	return sb.toString();

    }
}