h = int(input("Czas startu (godziny): ")) #wprowadzamy wszystkie dane 
m = int(input("Czas startu (minuty) "))
d = int(input("Czas trwania wydarzenia (minuty): "))
print("Wydarzenia zaczyna sie o %d:%d i trwa %d minut" %(h,m,d)) 
godz = ((m + d)//60 + h) % 24
minuta = (m + d) % 60
#wariant1
print("Wydarzenie zakończy się o %.2d:%.2d"%(godz, minuta))
#wariant2
print("Wydarzenie zakończy się o ", godz, ":" , minuta, sep="")
