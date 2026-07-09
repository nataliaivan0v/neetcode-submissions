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

        List<List<String>> anagramGroups = new ArrayList<List<String>>();
        for (Map.Entry<String, ArrayList<String>> entry : anagrams.entrySet()) {
            anagramGroups.add(entry.getValue());
        }
        return anagramGroups;
    }
}
