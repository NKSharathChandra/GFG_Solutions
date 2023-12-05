class Solution:
    def getMinDiff(self, arr, n, k):
        arr.sort()
        diff=arr[-1]-arr[0]
        mx=0
        mn=0
        for idx,val in enumerate(arr):
            if idx==0 or val<k or arr[-1]<k:
                continue
            mx=max(arr[idx-1]+k,arr[-1]-k)
            mn=min(arr[0]+k,val-k)
            diff=min(diff,abs(mx-mn))
        return diff
