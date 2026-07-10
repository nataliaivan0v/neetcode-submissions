class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int maxLength = 0;
        int currLength = 0;
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!chars.contains(c)) {
                chars.add(c);
                currLength++;
            } else {
                maxLength = Math.max(maxLength, currLength);
                i = (i + 1) - currLength;
                currLength = 1;
                chars = new ArrayList<>(List.of(s.charAt(i)));
            }
        }
        
        return Math.max(maxLength, currLength);
    }
}
