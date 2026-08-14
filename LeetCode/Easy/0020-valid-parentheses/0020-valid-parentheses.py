class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        brackets = {'(' : ')', '{' : '}', '[' : ']'}

        for bracket in s:
            if bracket in brackets:
            # if (bracket is '(') or (bracket is '[') or (bracket is '{'):
                stack.append(bracket)

            else:
                if len(stack) is 0:
                    return False
                
                if brackets[stack[-1]] != bracket:
                    return False
                stack.pop()
        return len(stack) is 0