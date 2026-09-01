class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        # """
        # 투포인터
        # time: O(nlogn)
        # space: O(1)
        # """
        # start, end = 0, len(numbers)-1

        # while start < end:
        #     merge = numbers[start] + numbers[end]

        #     if merge == target:
        #         return [start+1, end+1]
        #     elif merge < target:
        #         start+=1
        #     elif merge > target:
        #         end-=1
        
        """
        이진 탐색
        time: O(n)
        space: O(1)
        """
        for i in range(len(numbers)-1):
            complement = target-numbers[i]
            low, high = i+1, len(numbers)-1

            while low <= high:
                mid = (low+high)//2

                if numbers[mid] < complement:
                    low=mid+1
                elif numbers[mid] > complement:
                    high=mid-1
                else:
                    return [i+1, mid+1]

        