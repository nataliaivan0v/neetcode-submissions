class Solution {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }

        List<Integer> prevs = new ArrayList<Integer>();
        prevs.add(1);
        prevs.add(2);
        prevs.add(3);
        for (int i = 3; i < n; i++) {
            if (i == n - 1) {
                return prevs.get(i - 2) + prevs.get(i - 1);
            }
            prevs.add(prevs.get(i - 2) + prevs.get(i - 1));
        }

        return 0;
    }
}
