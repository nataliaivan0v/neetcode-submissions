class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[0];
        }

        int[] pair = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && i != j) {
                    if (i < j) {
                        pair[0] = i;
                        pair[1] = j;
                    } else {
                        pair[0] = j;
                        pair[1] = i;
                    }
                    return pair;
                }
            }
        }
        return pair;
    }
}
