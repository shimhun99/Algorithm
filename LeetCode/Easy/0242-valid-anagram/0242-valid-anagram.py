class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # 1. sort    
        return sorted(s) == sorted(t)

        # 2. hash table
        hash_table = {}

        for ch in s:
            if ch not in hash_table:
                hash_table[ch] = 0
            hash_table[ch] += 1
        
        for ch in t:
            if ch not in hash_table:
                return False
            elif hash_table[ch] == 0:
                del hash_table[ch]
            else:
                hash_table[ch] -= 1
        return not hash_table
