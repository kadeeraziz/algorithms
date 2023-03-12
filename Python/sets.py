import random

# 1. Create a set of 10 random numbers between 1 and 100
random_set = set()
while len(random_set) < 10:
    random_set.add(random.randint(1, 100))


# 2. Create a set of of Letters A-Z
letters = set()
for letter in range(65, 91):
    letters.add(chr(letter))

print(letters)


# 3. Create a set of the vowels
vowels = set()
for letter in range(65, 91):
    if chr(letter) in "AEIOU":
        vowels.add(chr(letter))
print(vowels)


# 4. Create a set of consonants
consonants = set()
for letter in range(65, 91):
    if chr(letter) not in "AEIOU":
        consonants.add(chr(letter))
print(consonants)

# 5. Create a set of sequare numbers from 1-100
squares = set()
for number in range(1, 101):
    squares.add(number ** 2)
print(squares)

# 6. Create a set of the first 100 Fibonacci numbers
fibonacci = set()
a, b = 0, 1 
for number in range(1, 101):
    fibonacci.add(a)
    a, b = b, a + b


# 7. Create a set of the first 100 prime numbers
primes = set()
for number in range(1, 101):
    if number > 1:
        for i in range(2, number):
            if (number % i) == 0:
                break
        else:
            primes.add(number)