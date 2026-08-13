class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # sort_s = sorted(s.lower())
        # sort_t = sorted(t.lower())

        # print(sort_s)
        # print(sort_t)

        # return sort_s == sort_t

        return sorted(s) == sorted(t)        