class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        # """
        # time: O(n^2)
        # space: O(1)
        # """ 

        # cnt=0

        # for num in nums:
        #     if num == 0:
        #         cnt+=1
        
        # for _ in range(cnt):
        #     nums.remove(0)
        #     nums.append(0)

        """
        # time: O(n^2)
        # space: O(1)
        # """
        # for i in range(len(nums)):
        #     if nums[i] == 0:
        #         for j in range(i+1, len(nums)):
        #             if nums[j] != 0:
        #                 nums[i], nums[j] = nums[j], nums[i]
        #                 break
        
        """

        """
        zeros = []
        non_zeros = []
        
        for num in nums:
            if num == 0:
                zeros.append(num)
            else:
                non_zeros.append(num)
        
        nums[:] = non_zeros + zeros

        