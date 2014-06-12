

def replace_spaces(s):
    split = s.split()
    output = ''
    i = 0
    while i < len(split) - 1:
        output += split[i] + '%20'
        i += 1

    output += split[i]
    return output        


def replace_spaces_joins(s):
    split = s.split()
    return '%20'.join(split)

test_string = 'Mr John Smith    '

#print replace_spaces(test_string)
print replace_spaces_joins(test_string)
