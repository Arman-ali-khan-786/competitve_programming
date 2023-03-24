############################# PROBLEM OF THE DAY - 22nd March 2023 #################################################
#-------------------------------------------------------------------------------------------------------------------


# Given a string S. In one operation, you can remove the substring "pr" from the string S and get amount X or 
# you can remove the substring "rp" and get the amount Y. 
# Find the maximum amount you can get if you perform zero or more such operations optimally. 


class Solution:
    def solve (self, X, Y, S):
        #code here
        x,y = 0,0
        while(True):
            if(X>=Y):
                if('pr'in S):
                    x +=S.count('pr')
                    S=S.replace('pr','')
                elif('rp' in S):
                    y+=S.count('rp')
                    S=S.replace('rp','')
                else:
                    break
                
            if(Y>X):
                if('rp'in S):
                    y+=S.count('rp')
                    S=S.replace('rp','')
                elif('pr'in S):
                    x+=S.count('pr')
                    S=S.replace('pr','')
                else:
                    break
            
        return (X*x)+(y*Y)