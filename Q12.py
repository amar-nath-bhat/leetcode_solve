charMap = {}
s = input("Enter string: ")
maxlen = 0
left = 0

for right in range(len(s)):
    if s[right] not in charMap or charMap[s[right]] < left :
        charMap[s[right]] = right
        maxlen = max(right-left+1, maxlen)
    else:
        left = charMap[s[right]]+1
        charMap[s[right]] = right

print(maxlen) 
