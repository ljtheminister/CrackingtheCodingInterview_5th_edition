

def hasUniqueChars_noDS(s):
    n = len(s)
    for i in xrange(n):
        for j in xrange(i+1,n):
            if s[i] == s[j]:
                return False

    return True

def hasUniqueChars_noDS_sort(s):
    char_list = sorted(s)
    i = 0
    while i < len(s)-1:
        if char_list[i] == char_list[i+1]:
            return False
        i += 1

    return True        
    

def hasUniqueChars_dict(s):
    charSet = dict()
    for c in s:
        try:
            if charSet[c]:
                return False
        except:
            charSet[c] = True

    return True



test_string = 'abcd0'

print hasUniqueChars_dict(test_string)
print hasUniqueChars_noDS_sort(test_string)
print hasUniqueChars_noDS(test_string)
