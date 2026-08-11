# Last updated: 8/11/2026, 2:14:55 PM
class Solution:
    def minimumGroups(self, words: List[str]) -> int:
        def min_rotation(s):
            n = len(s)
            if n<=1:
                return s
            t = s+s
            i, j, k = 0, 1, 0
            while i < n and j < n and k < n:
                if t[i + k] == t[j + k]:
                    k += 1
                elif t[i + k] > t[j + k]:
                    i += k + 1
                    if i <= j:
                        i = j + 1
                    k = 0
                else:
                    j += k + 1
                    if j <= i:
                        j = i + 1
                    k = 0
            start = min(i, j)
            return t[start:start + n]
        groups = set()
        for word in words:
            even = word[::2]
            odd = word[1::2]
            groups.add(min_rotation(even)+"#" + min_rotation(odd))
        return len(groups)    
                