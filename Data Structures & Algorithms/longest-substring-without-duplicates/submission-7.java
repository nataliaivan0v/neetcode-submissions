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
            // p w w k e w
            // 0 1 2 3 4 5
            // i = 0: p
            // i = 1: p w
            // i = 2: p w (w) 
            // i = 1: w
            // i = 2: w (w)
            // i = 2: w
            // i = 3: w k
            // i = 4: w k e
            // i = 5: w k e (w)
            // i = 3: k
            // i = 4: k e
            // i = 5: k e w
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
