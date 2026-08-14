class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}

        for word in strs:
            sort_word = "".join(sorted(word))
            if sort_word not in anagrams:
                anagrams[sort_word] = list()
            anagrams[sort_word].append(word)

        return list(anagrams.values())
        print(anagrams)