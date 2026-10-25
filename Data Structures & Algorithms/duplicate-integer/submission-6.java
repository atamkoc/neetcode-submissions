class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i<nums.length; i++) {
            if (count.get(nums[i]) == null) {
                count.put(nums[i], 1);
            }
            else{
                return true;
            }
        }


        return false;
        
    }
}