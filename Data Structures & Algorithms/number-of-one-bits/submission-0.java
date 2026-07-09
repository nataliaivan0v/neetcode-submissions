class Solution {
    public int hammingWeight(int n) {
        String numString = Integer.toBinaryString(n);
        int total = 0;
        for (char num : numString.toCharArray()) {
            if (num == '1') {
                total++;
            }
        }

        return total;
    }
}
