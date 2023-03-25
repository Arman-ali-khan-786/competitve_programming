import statistics
class Solution:
    def median(self, matrix, R, C):
        l=[]
        for i in range(R):
            for j in range(C):
                l.append(matrix[i][j])
        return int(statistics.median(l))
