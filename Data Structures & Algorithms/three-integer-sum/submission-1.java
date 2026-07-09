class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> sums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> sum = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(sum);
                        if (!sums.contains(sum)) {
                            sums.add(sum);
                        }
                    }
                }
            }
        }

        return sums;
    }
}
