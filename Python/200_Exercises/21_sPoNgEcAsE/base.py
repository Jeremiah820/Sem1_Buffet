str = input("Please enter a word:")

string1 = str.upper()
string2 = str.lower()
string3 = 1

for char in string1:
    string3 += 1
    #print(string1)
    if string3%2 == 0:     # even
        print(char.upper())
    else:                  # odd
        print(char.lower())
    
    #print(string2)