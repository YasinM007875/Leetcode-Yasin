# Last updated: 8/11/2026, 2:13:58 PM
class Solution:
    def countValidPrefixes(self, s: str) -> int:
     z = o = ans = 0
     for c in s:
        if c == '0':
            z += 1
        else:
            o += 1
        if abs(z - o) <= 1:  
            ans += 1
     return ans        