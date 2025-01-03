firstList =  list(input("Enter a sequence of comma separated values for first list: ").split(","))
secondList = list(input("Enter a sequence of comma separated values for second list: ").split(","))

print("First List ", firstList)
print("Second List ", secondList)

thirdList = []

for num in firstList:
    if (int(num) % 2 != 0):
        thirdList.append(num)
        
for num in secondList:
    if (int(num) % 2 == 0):
        thirdList.append(num)

print("Result List is:")
print(thirdList)