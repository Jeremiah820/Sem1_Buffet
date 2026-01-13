x = input("Please enter a number: ")
x = int(x)
s = 0
t = ""
i = 1
while i<=x:
    s = s + i
    if t=="":
        t = t + str(i)
    else:
        t = t + "+" + str(i)
    i = i + 1
print(t)
print("The sum of 1 to", x, "is:", s)
