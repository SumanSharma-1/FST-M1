import pandas

dataframe = pandas.read_excel('detail_excel.xlsx')

print(dataframe)

print("--------------------------")
print("Number of rows and columns:", dataframe.shape)

print("--------------------------")
print("Data in Emails column:")
print(dataframe['Email'])

print("--------------------------")
print("Data sorted with first names:")
print(dataframe.sort_values('FirstName'))