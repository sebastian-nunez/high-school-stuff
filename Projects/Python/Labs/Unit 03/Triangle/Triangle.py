import math

class Triangle:
   def __init__(self,a,b,c):
      self.a = a
      self.b = b
      self.c = c

   def calc_perimeter(self):
      return self.a + self.b + self.c

   def calc_area(self):
      s = self.calc_perimeter() / 2
      return round(math.sqrt( s * (s - self.a) * (s - self.b) * (s - self.c)), 2)

   def print_result(self):
      print("\nTriangle sides: " + str(self.a) + ", " + str(self.b) + ", " + str(self.c))
      print("The area is " + str(self.calc_area()))

class Runner():
   response = 'Y'

   while response != 'N':
      a = int(input("\nEnter side a :: "))
      b = int(input("Enter side b :: "))
      c = int(input("Enter side c :: "))

      run = Triangle(a,b,c)
      run.print_result()

      response = input("\nMore inputs? :: [Y/N] ")
