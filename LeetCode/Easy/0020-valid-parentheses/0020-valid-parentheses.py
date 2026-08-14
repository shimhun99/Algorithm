class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        brackets = {'(' : ')', '{' : '}', '[' : ']'}

        for bracket in s:
            if bracket in brackets:
                stack.append(bracket)

            else:
                # if len(stack) is 0:
                #     return False
                
                # if brackets[stack.pop()] is not bracket:
                #     return False

                if not stack or bracket != brackets[stack.pop()]:
                    return False
        return not stack