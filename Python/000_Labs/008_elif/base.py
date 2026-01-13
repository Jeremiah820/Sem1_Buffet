

num1 = int(input("Enter a number: "))
op = input("Enter an operation (+, -, *, /): ")
num2 = int(input("Enter another number: "))

if op == "+":
    print(num1 + num2)
elif op == "-":
    print(num1 - num2)
elif op == "*":
    print(num1 * num2)
elif op == "/":
    print(num1 / num2)
else:
    print("Invalid operation!")
