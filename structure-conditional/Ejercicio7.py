#varible
montop=0.0
horas=int(input("ingrese horas en estacionamiento:"))
#proceso  
if horas>0 and horas<=2:
  montop=horas*5
elif horas>2 and horas<=5:
  montop=(2*5)+(horas-2)*4
elif horas>5 and horas<=10:
  montop=(2*5)+(3*4)+(horas-5)*3
else:
  montop=(2*5)+(3*4)+(5*3)+(horas-10)*0.20
print("El costo a cobrar es:", montop)