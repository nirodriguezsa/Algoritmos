import matplotlib.pyplot as plt
import time

fibon = 0
x = 0
y = 1
z = 0
totTime = 0
arr = []
MAX = 100000

while fibon< MAX:
    iniTime = time.time()
    z=x+y
    x=y
    y=z
    endTime= time.time()
    totTime += endTime - iniTime
    arr.append(totTime)
    fibon+=1
plt.plot(arr)
plt.show()
print 'El numero Fibonacci es:' + str(fib)
