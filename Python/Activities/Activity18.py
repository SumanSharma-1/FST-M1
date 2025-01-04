import pandas

dataframe = pandas.read_csv("details.csv")

print("Full Data: ")
print(dataframe)

print("--------------------")
print("Usernames:")
print(dataframe["Usernames"])

print("--------------------")
print("Username: ", dataframe["Usernames"][1], " and ", "Password: ", dataframe["Passwords"][1])

print("--------------------")
print("Data sorted in ascending usernames:")
print(dataframe.sort_values('Usernames'))

print("--------------------")
print("Data sorted in descending passwords:")
print(dataframe.sort_values('Passwords', ascending=False))