class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return false;
        }

        char[] chars = s1.toCharArray();
        Arrays.sort(chars);

        String sorted = String.valueOf(chars);
        System.out.println(sorted);
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            String substring = s2.substring(i, i + s1.length());

            char[] sortedChars = substring.toCharArray();
            Arrays.sort(sortedChars);
            String sortedSubstring = String.valueOf(sortedChars);
            System.out.println(sortedSubstring);

            if (sorted.equals(sortedSubstring)) {
                return true;
            }
        }

        return false;
    }
}
