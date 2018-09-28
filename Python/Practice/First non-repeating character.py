#By: Kevin Hernandez Vazquez
""" Write a function named firstNonRepeatingLetter† that 
    takes a string input, and returns the first character 
    that is not repeated anywhere in the string. """

import re

def first_non_repeating_letter(string):
    if string == '': return ''
    for x in string:
        pattern = r"{}".format(x.lower())
        if len(re.findall(pattern, string.lower())) == 1:
            return 'The first non repeating letter is '+x
    return ''

while True:
    print(first_non_repeating_letter(input("Enter a word: ")))
    print()