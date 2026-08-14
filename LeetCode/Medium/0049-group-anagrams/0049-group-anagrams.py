class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # # 1. 문자열 정렬해서 key로 사용
        # anagrams = {}

        # for word in strs:
        #     sort_word = "".join(sorted(word))
        #     if sort_word not in anagrams:
        #         anagrams[sort_word] = list()
        #     anagrams[sort_word].append(word)

        # return list(anagrams.values())

        # 2. 각 문자의 갯수를 key로 사용
        anagrams = {}
        for word in strs:
            counter = [0] * 26
            for ch in word:
                counter[ord(ch) - ord('a')] += 1

            key = tuple(counter)

            if key not in anagrams:
                anagrams[key] = []
            anagrams[key].append(word)
        return list(anagrams.values())