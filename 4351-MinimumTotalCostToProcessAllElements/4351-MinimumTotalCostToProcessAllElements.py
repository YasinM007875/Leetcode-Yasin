# Last updated: 8/11/2026, 2:14:24 PM
class Solution:
    def minimumCost(self, nums: list[int], k: int) -> int:
        MOD = 10**9 + 7
        resources = k
        operations = 0
        cost = 0
        
        for x in nums:
            if resources < x:
                need = (x - resources + k - 1) // k
                cost = (cost + (operations + 1 + operations + need )* need // 2) % MOD
                operations += need
                resources += need * k
            resources -= x
        return cost