
def intersection(nums1, nums2):
    # res = set()
    # nums3 = []
    # if len(nums1)==0 or len(nums2)==0:
    #     return None
    
    # for i in nums1:
    #     for j in nums2:
    #         if i==j:
    #             res.add(j)

    # for i in res:
    #     nums3.append(i)
    # return res
# can be done in one line 
    return list(set(nums1)& set(nums2))
    
    
nums1 = [1,2,2,1]
nums2 = [2]
nums3=intersection(nums1, nums2)
print(nums3)