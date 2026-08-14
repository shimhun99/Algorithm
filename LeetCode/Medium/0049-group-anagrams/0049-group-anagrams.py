class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # anagrams = {}

        # for word in strs:
        #     sort_word = "".join(sorted(word))
        #     if sort_word not in anagrams:
        #         anagrams[sort_word] = list()
        #     anagrams[sort_word].append(word)

        # return list(anagrams.values())

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