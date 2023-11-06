def removeElement(nums, val):
    j=0
    for num in nums:
        if num!=val:
            nums[j]=num
            j+=1
    return len(nums)

nums = [-1,0,0,0,0,3,3]
print(removeElement(nums, 0))
print(nums)