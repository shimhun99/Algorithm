class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        # brackets = {'(' : ')', '{' : '}', '[' : ']'}

        opening = "({["
        closing = ")}]"
        brackets = dict(zip(opening, closing))

        for bracket in s:
            if bracket in opening:
                stack.append(bracket)

            elif bracket in closing:
                # if len(stack) is 0:
                #     return False
                
                # if brackets[stack.pop()] is not bracket:
                #     return False

                if not stack or bracket != brackets[stack.pop()]:
                    return False
        return not stack