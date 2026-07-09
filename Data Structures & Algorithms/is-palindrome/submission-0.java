class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return filtered.equals(new StringBuilder(filtered).reverse().toString());
    }
}
