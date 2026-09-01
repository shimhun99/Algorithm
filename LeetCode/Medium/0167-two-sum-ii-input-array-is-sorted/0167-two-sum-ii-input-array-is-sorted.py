class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        start, end = 0, len(numbers)-1

        while start < end:
            merge = numbers[start] + numbers[end]

            if merge == target:
                return [start+1, end+1]
            elif merge < target:
                start+=1
            elif merge > target:
                end-=1
        

        