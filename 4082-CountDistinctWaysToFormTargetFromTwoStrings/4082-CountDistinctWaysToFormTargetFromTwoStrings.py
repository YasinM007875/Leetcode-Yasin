# Last updated: 8/11/2026, 2:14:53 PM
from functools import lru_cache
class Solution:
    def interleaveCharacters(self, word1: str, word2: str, target: str) -> int:
        MOD = 10**9 + 7
        n1,n2 = len(word1), len(word2)
        @lru_cache(None)
        def dfs(i,p1,p2,mask):
            if i == len(target):
                return 1 if mask == 3 else 0
            ans = 0
            for j in range(p1 + 1, n1):
                if word1[j] == target[i]:
                    ans = (ans + dfs(i + 1,j, p2, mask | 1)) % MOD
            for j in range(p2 + 1, n2):
                if word2[j] == target[i]:
                    ans = (ans + dfs(i + 1,p1, j, mask | 2)) % MOD
            return ans
        return dfs(0, -1, -1, 0)    
        