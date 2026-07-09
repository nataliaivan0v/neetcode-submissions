class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int currProduct = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    currProduct *= nums[j];
                }
            }
            products[i] = currProduct;
        }

        return products;
    }
}  
