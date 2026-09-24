class Solution:
    def firstMissingPositive(self, nums: list[int]) -> int:
        
        """
        time: O(n)
        space: O(1)
        """
        n = len(nums)

        for i in range(n):
            # nums[i]를 자기 자리로 보냄. 받아올 값도 자리가 있으면 계속 보냄
            while 1<= nums[i] <= n and nums[nums[i]-1] != nums[i]:
                j=nums[i]-1
                nums[i], nums[j] = nums[j],nums[i]

        for i in range(n):
            if nums[i] != i+1:
                return i+1
        return n+1
        