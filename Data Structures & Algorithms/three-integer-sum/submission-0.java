class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        Use a hashmap
            HashMap< Integer, HashMap<Integer, Integer>> 
            Time complexity O(n), Space complexity O(n2)



        Sort the array and then two pointer:
            Sorting itself through Arrays class is O(n logn)

            then for each number.
            have a left pointer pointing to i+1 for number i 
            have a right pointer pointing to the last element

            if the currentSum of number, left, right is less than target then increase left
                                                     is more than target then decrease right
                                                     is equal consider it as a triplet  


        edge cases:
            nums.length <= 3 =====> already handled by the problem definition

        */
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList <>();

        for (int i = 0; i < nums.length - 2; i++){

            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length - 1;

            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum < 0) {
                    left++;
                }

                else if (currentSum > 0){
                    right --;
                }
                else{
                    triplets.add(List.of(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;

                }
            }
        }

        return triplets;


        
    }
}
