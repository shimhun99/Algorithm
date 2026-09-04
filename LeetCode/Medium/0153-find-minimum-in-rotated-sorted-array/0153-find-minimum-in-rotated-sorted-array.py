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
        이진 탐색
        time: O(logn)
        space: O(1)
        """
        low, high = 1, len(nums)-1

        while low <= high:
            mid = (low+high)//2
            # 꺾인 지점 발견
            if nums[mid-1] > nums[mid]:
                return nums[mid]
            # nums[0]과 mid 사이의 값들은 전부 오름차순 정렬되어있음 -> 오른쪽 범위에서 꺾인 구간 찾기
            if nums[0] < nums[mid]:
                low=mid+1
            # nums[0]과 mid 사이에서 한번 꺾인 구간이 있음 -> 왼쪽 구간에서 nums[0]보다 큰 값을 찾기
            else:
                high=mid-1
        return nums[0]