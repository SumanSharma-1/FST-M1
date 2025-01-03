fruit_shop = {
    "apple": 10,
    "banana": 15,
    "melon": 40,
    "guava": 10
}

user_input = input("What are you looking for? ").lower()

if(user_input in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")