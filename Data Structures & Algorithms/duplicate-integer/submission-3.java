class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for (Integer num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }
}