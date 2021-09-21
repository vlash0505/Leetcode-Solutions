class Solution {
    public int[] twoSum(int[] nums, int target) throws IllegalArgumentException{
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numsMap.containsKey(complement)) {
                return (new int[] {numsMap.get(complement), i});
            }
            numsMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solutions.");
    }
}