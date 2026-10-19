class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        print(list(set(nums)))
        return list(set(nums)) != nums
         