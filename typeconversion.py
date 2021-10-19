#ask the year and calculate the age
#whatever we type in the terminal is considered as a string
#2021-'2000' so we convert a string into int . likewise we can use for float(),bool(),double()
birth_year=int(input('Birth year : '))
print(type(birth_year))
age=2021-birth_year
print(type(age))
print(age)
# <class 'int'>
# <class 'int'>
# 21 