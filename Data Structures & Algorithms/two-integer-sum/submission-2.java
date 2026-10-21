class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> myHash = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int remainder = target - nums[i];
            if (myHash.get(remainder) != null) {
                return new int[] {myHash.get(remainder), i};
            }
            else{
                myHash.put(nums[i], i);
            }
        }


        return new int[] {-1,-1};
    }
}
