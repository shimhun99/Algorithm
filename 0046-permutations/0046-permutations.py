class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:

        """
        # 순열(permutation)
        nPr = n! / (n-r)!
        """

        # result = []

        # def dfs(s: List[int]):
        #     if len(s) == len(nums):
        #         result.append(s[:])
        #         return

        #     for n in nums:
        #         if n not in s:
        #             s.append(n)
        #             dfs(s)
        #             s.pop()

        # dfs([])
        # return result

        permutations = []

        def dfs(picked, unpicked):
            if not unpicked:
                return permutations.append(picked)
            for i, num in enumerate(unpicked):
                dfs(picked + [num], unpicked[:i] + unpicked[i+1 :])
        dfs([], nums)

        return permutations