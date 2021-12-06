
def suma(x, y): return x + y
def resta(x, y): return x - y
def multi(x, y): return x * y
def division(x, y): return x / y

def operacion(x,y, fun):
  return fun(x,y)

print(operacion(10,2,suma))
print(operacion(10,2,resta))
print(operacion(10,2,multi))
print(operacion(10,2,division))