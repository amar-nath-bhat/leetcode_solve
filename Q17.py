def removeDuplicates(nums):
    numSet = set()
    for num in nums:
        if num not in numSet:
            numSet.add(num)
    n = len(numSet)
    
    for i in range(n):
        nums[i] = min(numSet)
        numSet.remove(min(numSet))
    return n

nums = [-1,0,0,0,0,3,3]
print(removeDuplicates(nums))
print(nums)