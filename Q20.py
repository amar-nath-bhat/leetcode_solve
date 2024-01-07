
def intersection(nums):
    res = set()
    nums3 = []
    for i in range(0, len(nums)):
        if len(nums[i]) == 0:
            return None
    
    for i in nums[0]:
        flag = 0
        exit = 0
        for array in nums:
            if i in array:
                flag = 1
            else:
                exit = 1
        if exit == 1:
            continue
        if flag == 1:
            res.add(i)
    
    for i in res:
        nums3.append(i)
    nums3=sorted(nums3)
    return nums3


nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
nums1 = intersection(nums)

print(nums1)