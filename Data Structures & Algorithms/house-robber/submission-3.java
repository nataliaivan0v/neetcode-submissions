class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] maxProfitAt = new int[nums.length];
        maxProfitAt[0] = nums[0];
        maxProfitAt[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            maxProfitAt[i] = Math.max(maxProfitAt[i - 1], nums[i] + maxProfitAt[i - 2]);
        }

        return Arrays.stream(maxProfitAt).max().getAsInt();
    }
}
