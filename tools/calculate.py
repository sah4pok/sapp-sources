
# This function fixVC
def calcXY(x, y):
    return x + y

# This function fixVC
# 5 for Vice City height fix
def calcVCZ(x, y):
    return y - 5.0
# 3 for Liberty City height fix
def calcLCZ(x, y):
    return y - 5.0

# Vice City Zero Coordinates
numVCX = 8250.0  
numVCY = -8250.0
numVCZ = 0.0 
# Liberty City Zero Coordinates
numLCX =  
numLCY = 
numLCZ = 0.0 

print("Select the game map")
print("1.Covert (Vice City)")
print("2.Convert (Liberty City)")

while True:
    # take input from the user
    choice = input("Enter choice(1/2): ")

    # check if choice is one of the four options
    if choice in ('1', '2'):
        try:
            num1 =float(input("Enter the coordinate (X): "))
            num2 = float(input("Enter the coordinate (Y): "))
            num3 = float(input("Enter the coordinate (Z): "))
        except ValueError:
            print("Invalid input. Please enter a number.")
            continue

        if choice == '1':
            print(numVCX, "+", num1, "=", round(calcXY(numVCX, num1), 4))
            print(numVCY, "+", num2, "=", round(calcXY(numVCY, num2), 4))
            # +5 to fix Z coordinate Vice
            print(numVCZ, "-", "5", "=", round(calcVCZ(numVCZ, num3), 4))
            # print the final result
            print (round(calcXY(numVCX, num1), 4), round(calcXY(numVCY, num2), 4), round(calcVCZ(numVCZ, num3), 4))

        if choice == '2':
            print(numVCX, "+", num1, "=", round(calcXY(numLCX, num1), 4))
            print(numVCY, "+", num2, "=", round(calcXY(numLCY, num2), 4))
            # +3 to fix Z coordinate Liberty
            print(numVCZ, "-", num3, "+", "3", "=", round(calcLCZ(numLCZ, num3), 4))

        
        # check if user wants another calculation
        # break the while loop if answer is no
        next_calculation = input("Let's do next calculation? (yes/no): ")
        if next_calculation == "no":
          break
    else:
        print("Invalid Input")