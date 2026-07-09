class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<List<String>>();
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(strs[i]);
            } else {
                List<String> anagram = new ArrayList<>();
                anagram.add(strs[i]);
                map.put(sortedString, anagram);
            }
        }

        return new ArrayList<>(map.values());
    }
}
