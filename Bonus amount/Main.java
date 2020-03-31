bonus=int(input())
mob=int(input())
if bonus>10000:
  bal=int(bonus-mob)
  if(bal>=mob):
    print("You can buy the mobile")
  else:
    print("You can't buy the mobile")
else:
  print("You can't buy the mobile")