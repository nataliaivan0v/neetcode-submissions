class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqs = new HashMap<Integer, Integer>();
        
        for (int num : nums) {
            freqs.putIfAbsent(num, 0);
            freqs.computeIfPresent(num, (key, value) -> value + 1); 
        }

        Map<Integer, Integer> sorted = freqs.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        List<Integer> ks = new ArrayList<Integer>();
        for (Integer key : sorted.keySet()) {
            if (k >= 1) {
                ks.add(key);
            }
            k--;
        }
        return ks.stream().mapToInt(i->i).toArray();
    }
}
