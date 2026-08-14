class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        brackets = {'(' : ')', '{' : '}', '[' : ']'}

        for bracket in s:
            print("loop test")

            if (bracket is '(') or (bracket is '[') or (bracket is '{'):
                print(bracket)
                stack.append(bracket)

            else:
                if len(stack) is 0:
                    # print(stack)
                    print("test1")
                    return False
                
                if brackets[stack[-1]] != bracket:
                    # print(stack)
                    print(brackets[stack[-1]])
                    print(bracket)
                    print("test2")
                    return False
                stack.pop()
        print(stack)
        return len(stack) is 0