class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sorted = new String(charArray);
            anagrams.putIfAbsent(sorted, new ArrayList<>());

            anagrams.get(sorted).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
