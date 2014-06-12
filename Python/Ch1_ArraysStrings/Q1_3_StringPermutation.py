def check_permutation(s1, s2):
    if len(s1) != len(s2):
        return False

    return sorted(s1)==sorted(s2)


test1 = 'abcde'
test2 = 'eabcd0' 

print check_permutation(test1, test2)

