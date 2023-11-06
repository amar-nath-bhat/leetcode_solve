from ast import List


class Solution:
    def findMedianSortedArrays(self, nums1: List, nums2: List) -> float:
        res = sorted(nums1+nums2)
        n = len(res)
        if(n%2==0):
            mid1 = res[n//2]
            mid2 = res[n//2-1]
            return (mid1+mid2)/2
        else:
            return res[n//2]

sol = Solution()
print(sol.findMedianSortedArrays([1,2,3], [4,5,6]))



        


