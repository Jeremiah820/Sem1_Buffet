def add(x, y):
    sum = x + y
    return sum
#------------------------
def mult(x, y):
    prod = x * y
    return prod
# -----------------------
def printList(lst):
    i = 1
    for item in lst:
        print(str(i) + ". " + item)
        i = i + 1
 
def addList(lst):
    sum = 0
    for num in lst:
        sum = sum + num
    return sum

# -----------------------
ans = add(8, 3)
print(ans)
# -----------------------
christmasList = ["Nintendo 2","A new phone case", "New Airpods", "New oculus", "A new computer headset"]
printList(christmasList)
# -----------------------

listFavNum = [67, 43, 41, 21, 27, 2, 6, 7]
print(addList(listFavNum))
# -----------------------

