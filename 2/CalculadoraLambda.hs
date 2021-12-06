suma = (\x y-> x+y)
resta = (\x y-> x-y)
multi = (\x y-> x*y)
division = (\x y-> x/y)
main = do
 print(suma 3 6)
 print(resta 3 2)
 print(multi 2 2)
 print(division 10 2)