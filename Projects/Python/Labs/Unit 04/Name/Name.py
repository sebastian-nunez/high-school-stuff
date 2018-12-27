fullName = input("Enter full name :: ")

first = fullName[: fullName.find(' ')]
last = fullName[fullName.find(' '):]

print(f"First name: {first}")
print(f"Last name: {last}")
