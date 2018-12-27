import math

class Circle:
   def __init__(self,radius):
      self.radius = radius

   def calc_area(self):
      return math.pi * math.pow(self.radius,2)

   def print_result(self):
      print("The area is " + str(round(self.calc_area(),4)))


class Runner():
   run = Circle(1)

   run.calc_area()
   run.print_result()
