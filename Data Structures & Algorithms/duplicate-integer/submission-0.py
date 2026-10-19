class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        return list(set(nums)) != nums
         