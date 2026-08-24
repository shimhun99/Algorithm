class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        # def dfs(start, end):
        #     if nums[start] + nums[end] == target:
        #         return [start, end]
        #     if start >= end:
        #         return
        #     dfs(start+1, end)
        #     dfs(start, end-1)
        
        # dfs(0, len(nums)-1)
        
        nums_idx = {}

        for i, num in enumerate(nums):
            nums_idx[num] = i

        for i, num in enumerate(nums):
            diff = target - num

            if diff in nums and nums_idx[diff] != i:
                return [i, nums_idx[diff]] 