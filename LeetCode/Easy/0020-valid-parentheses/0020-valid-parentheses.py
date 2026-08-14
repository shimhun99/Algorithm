class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        brackets = {'(' : ')', '{' : '}', '[' : ']'}

        for bracket in s:
            if bracket in brackets:
                stack.append(bracket)

            else:
                if len(stack) is 0:
                    return False
                
                if brackets[stack.pop()] is not bracket:
                    return False
        return len(stack) is 0