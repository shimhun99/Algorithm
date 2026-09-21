class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        """
        after, before에는 누적곱을 각각 저장
        
        time: O(3n)=O(n)
        space: O(2n)=O(n)
        """
        before = [1] * len(nums)
        for i in range(len(nums)-1):
            before[i+1] = before[i] * nums[i]
        
        after=[1]*len(nums)
        for i in range(len(nums)-1, 0, -1):
            after[i-1] = after[i] * nums[i]
        
        products=[]
        for b,a in zip(before, after):
            products.append(b*a)
        
        return products
        