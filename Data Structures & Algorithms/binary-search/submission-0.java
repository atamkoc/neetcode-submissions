class Solution {
    public int search(int[] nums, int target) {
        /*
        [1,2,3,4]

        looking for 2
        low = 0
        nums[low] = 1
        high = 3
        nums[high] = 4
        mid = 1
        nums[mid] = 2

        */


        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target){
                // check the left half
                right = mid - 1;
            }
            else {
                //checkl the right half
                left = mid + 1;                
            }
        }

        return -1;
        
    }
}
