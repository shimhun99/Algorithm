class Solution:
    def isPalindrome(self, s: str) -> bool:
        # # 리스트 만들고, reverse해서 비교
        # convert_s = [ch for ch in s.lower() if ch.isalnum()]
        # return convert_s == convert_s[::-1]

        # print(convert_s)

        # 투포인터
        start, end = 0, len(s)-1

        while start < end:
            while start < end and not s[start].isalnum():
                start+=1
            while start < end and not s[end].isalnum():
                end-=1

            if s[start].lower() != s[end].lower():
                return False

            start, end = start+1, end-1
        return True