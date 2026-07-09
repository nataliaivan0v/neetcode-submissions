class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSums = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (i != j && j != k && i != k) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> sums = new ArrayList<Integer>();
                            sums.add(nums[i]);
                            sums.add(nums[j]);
                            sums.add(nums[k]);
                            Collections.sort(sums);
                            threeSums.add(sums);
                        }
                    }
                }
            }
        }
        Set<List<Integer>> set = new HashSet<List<Integer>>(threeSums);
        return new ArrayList<List<Integer>>(set);
    }
}
