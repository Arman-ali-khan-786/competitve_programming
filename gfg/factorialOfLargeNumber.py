class Solution:
    def factorial(self, N):
        #code here
        f=1
        for i in range(N,1,-1):
            f = f*i
        return str(f)