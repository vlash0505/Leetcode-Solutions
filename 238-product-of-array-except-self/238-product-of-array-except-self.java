class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int n = nums.length;
        int[] result = new int[n];
        int product = 1;
        int zeroesCounter = 0;
        int productOfNonZeroes = 1;
        for (int i = 0; i < n; i++) {
            product *= nums[i];
            if (nums[i] == 0) {
                zeroesCounter++;
            } else {
                productOfNonZeroes *= nums[i];
            }
        }
        if (product != 0) {
            for (int i = 0; i < n; i++) {
                result[i] = product/nums[i];
            }
        } else if (zeroesCounter == 1) {
             for (int i = 0; i < n; i++) {
                 if (nums[i] == 0) {
                     result[i] = productOfNonZeroes;
                 }
             }
        }
        return result;
    }
}