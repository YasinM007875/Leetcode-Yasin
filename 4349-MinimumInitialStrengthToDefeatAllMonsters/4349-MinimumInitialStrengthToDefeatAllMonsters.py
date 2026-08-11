# Last updated: 8/11/2026, 2:14:25 PM
class Solution(object):
    def minInitialStrength(self, monsters, boosts):
        n = len(monsters)
        diff = [0] * (n+1)
        for l,r,v in boosts:
            diff[l] += v
            if r + 1 < n:
                diff[r + 1] -= v
        bonus = [0] * n
        cur = 0
        for i in range(n):
            cur += diff[i]
            bonus[i] = cur
        def check(strength):
            cur = strength
            for i in range(n):
                if cur + bonus[i] < monsters[i]:
                    return False
                cur -= monsters[i]
                if cur < 0:
                    cur = 0
            return True
        lo, hi = 0,sum(monsters)
        while lo < hi:
            mid = (lo + hi) // 2
            if check(mid):
                hi = mid
            else:
                lo = mid + 1
        return lo        
                