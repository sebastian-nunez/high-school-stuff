# name input
name = input("Enter first name :: ")

# birthyear input
birth_year = int(input("Enter birth year :: "))

# calculate age
age = (2018 - birth_year)

# outputs greeting
print("Hello, " + name + ". From the information provided, you're currently (or will be) " +
      str(age) + " years old. Congratulations!")
