class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """ 

        cnt=0

        for num in nums:
            if num == 0:
                cnt+=1
        
        for _ in range(cnt):
            nums.remove(0)
            nums.append(0)
        