class Solution:
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if matrix == []:
            return []
        m = len(matrix)
        n = len(matrix[0])
        target1 = [[] for i in range(m + n - 1)]
        for x, i in enumerate(matrix):
            for y, j in enumerate(i):
                if (x + y) % 2 == 0:
                    target1[x + y].insert(0, j)
                else:
                    target1[x + y].append(j)
        from functools import reduce
        return reduce(lambda x, y: x + y, target1)
