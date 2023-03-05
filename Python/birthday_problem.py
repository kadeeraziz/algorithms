
students = [
    ('Alice', '1990-01-01'),
    ('Bob', '1990-01-02'),
    ('Charlie', '1990-01-03'),
    ('David', '1990-01-04'),
    ('Eve', '1990-01-05'),
    ('Frank', '1990-01-06'),
    ('Grace', '1990-01-06'),
    ('Heidi', '1990-01-08'),
    ('Ivan', '1990-01-09'),
    ('Judy', '1990-01-10'),
    ('Kevin', '1990-01-11'),
    ('Linda', '1990-01-12'),
    ('Mike', '1990-01-13'),
    ('Nancy', '1990-01-14'),
    ('Oliver', '1990-01-15'),
    ('Patricia', '1990-01-16'),
    ('Quentin', '1990-01-17'),
]

class StaticArray:
    def __init__(self, size):
        self._items = [None] * size

    def __len__(self):
        return len(self._items)

    def __getitem__(self, index):
        return self._items[index]

    def __setitem__(self, index, value):
        self._items[index] = value

def birthday_match(students):
    """
    Find a pair of students with the same birthday.
    Input: a list of tuples (name, birthday) tuples
    Output: a tuple (name1, name2)
    """

    n = len(students)
    records = StaticArray(n)

    for k in range(n):
        (name1, birthday1) = students[k]
        # Return pair of names if a match is found
        for i in range(k):
            (name2, birthday2) = records.__getitem__(i)
            if birthday1 == birthday2:
                return (name1, name2)
        records.__setitem__(k, (name1, birthday1))


print(birthday_match(students))