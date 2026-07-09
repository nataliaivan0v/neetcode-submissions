class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int longest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currLongest = 1;
            if (!Arrays.asList(nums).contains(nums[i] - 1)) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j - 1] == nums[j] - 1) {
                        currLongest++;
                    } else if (nums[j - 1] == nums[j]) {
                        continue;
                    } else {
                        break;
                    }
                }
            }
            longest = Math.max(longest, currLongest);
        }

        return longest;
    }
}
