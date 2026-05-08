class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums_dict = {}
        for num in nums:
            if num in list(nums_dict.keys()):
                nums_dict[num] = nums_dict.get(num) + 1
            else:
                nums_dict[num] = 1
        
        return list(nums_dict.keys()) != nums


         