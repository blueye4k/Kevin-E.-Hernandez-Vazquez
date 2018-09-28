#By: Kevin Hernandez Vazuqez

from itertools import permutations as p

def permutations(string): return list(set([''.join(i) for i in p(string)]))

while True: print(permutations(input()))