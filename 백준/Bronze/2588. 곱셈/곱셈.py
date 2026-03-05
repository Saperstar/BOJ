a = int(input())
b = int(input())
b1=int(b-(b//100)*100)   #두번째자리까지
b2=int(b1-(b1//10)*10)    #첫번째자리
b3=int((b1-b2)//10)      #두번째자리

print(a*b2)
print(a*b3)
print(a*(b//100))
print(a*b)
