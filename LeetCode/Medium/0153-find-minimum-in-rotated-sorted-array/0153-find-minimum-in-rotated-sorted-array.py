class Solution:
    def findMin(self, nums: List[int]) -> int:
        # return min(nums)

        """
        time: O(n)
        space: O(1)
        """
        for i in range(len(nums)-1):
            if nums[i] > nums[i+1]:
                return nums[i+1]

        return nums[0]

        """
        time: O
        space: 
        """
        low, high = 1, len(nums)-1

        while low <= high:
            mid = (low+high)//2
            if nums[mid-1] > nums[mid]:
                return nums[mid]
            if nums[0] < nums[mid]:
                low=mid+1
            else:
                high=mid-1
        return nums[0]