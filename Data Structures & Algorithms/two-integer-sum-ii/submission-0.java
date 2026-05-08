class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        First approach:
        For each number in the array list keep them as keys and their index.
        When you need a number from the array go and get its index.
        Return i-1 and corresponding number's index-1 

        O(n) time complexity, O(n) space complexity

        Second approach:
        We can have two pointers. One pointing to the first element one pointing to the last element in the beginning.
        For instance: 

            [1,2,3,4]
            left = 1
            right = 4
            left + right = 5

            if we increase left the sum will go up
            if we decrease right the sum will gou down 
            Because the array is already sorted

            By manipulating the left, right pointers we can try to find the targetsum

        
        O(n) time complexity, O(1) space complexity (no extra space)

        edge case:
        length <=2 -> covered 
        */

        int left = 0;
        int right = numbers.length - 1;

        while (left < right){
            int currentSum = numbers[left] + numbers[right];

            if (currentSum < target){
                left++;
            }
            else if (currentSum > target){
                right--;
            }
            else{
                return new int [] {left +1 , right+1};
            }
        }


        return new int [] {-1, -1};


    }
}
