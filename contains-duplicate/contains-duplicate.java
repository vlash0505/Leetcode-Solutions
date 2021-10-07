class Solution {
    public boolean containsDuplicate(int[] nums) {        
        if(nums.length == 0 || nums.length == 1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) {
                return true;                
            }
            set.add(i);
        }
        return false;        
    }
}