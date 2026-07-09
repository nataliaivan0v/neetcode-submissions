class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            int freq = map.get(num);
            map.put(num, freq + 1);
        }

        LinkedHashMap<Integer, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue, 
                (oldValue, newValue) -> oldValue, 
                LinkedHashMap::new
            ));

        int[] result = new int[k];
        int count = 0;
        for (Integer key : sortedMap.keySet()) {
            if (count < k) {
                result[count] = key;
                count++;
            } else {
                break;
            }
        }
        return result;
    }
}
