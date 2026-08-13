class Solution:
    def isPalindrome(self, s: str) -> bool:
        # 1. 문자열 공백 제거 + 문자/숫자가 아닌거 전부 제거
        s = "".join(ch for ch in s if ch.isalnum())

        # 2. 소문자 변환
        s = s.lower()

        # 3. 문자열 뒤집기
        reverse_s = s[::-1]

        if s == reverse_s: 
            return True
        else:
            return False