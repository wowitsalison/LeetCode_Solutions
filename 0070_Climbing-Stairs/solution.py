class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        solution = [0] * (n+1)

        if n >= 1:
            solution[1] = 1
        if n >= 2:
            solution[2] = 2

        for i in range(3, n+1):
            solution[i] = solution[i-1] + solution[i-2]
        
        return solution[n]
