class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                Character lower = Character.toLowerCase(c);
                sb.append(lower.toString());
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}
