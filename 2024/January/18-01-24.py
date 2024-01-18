class Solution:
    def min_sprinklers(self, gallery, n):
        # code here
        range_list=[]
        for i in range(n):
            if gallery[i]!=-1:
                range_list.append([max(0,i-gallery[i]), min(n-1, i+gallery[i])])
        start=0
        ans=0
        range_list.sort(reverse=True)
        max_range=0
        while start<n:
            if range_list and range_list[-1][0]<=start:
                s,e=range_list.pop()
                max_range=max(max_range, e+1)
            elif max_range>start:
                start=max_range
                ans+=1
                    
            else:
                return -1
        return ans
