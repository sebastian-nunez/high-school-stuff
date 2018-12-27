import math

class Cube:
   def __init__(self, side):
      self.side = side

   def calc_suface_area(self):
      return (6*int(math.pow(self.side,2)))

   def print_result(self):
      print("The suface area is " + str(self.calc_suface_area()))

class Runner():
   run = Cube(2)

   run.calc_suface_area()
   run.print_result()
