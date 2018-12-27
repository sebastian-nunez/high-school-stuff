class Rectangle:
   def __init__(self,length,width):
      self.length = length
      self.width = width

   def calc_perimeter(self):
      return 2 * self.length + 2 * self.width

   def print_perimeter(self):
      print("The perimeter is " + str(round(self.calc_perimeter(),2)))

class Runner():
   run = Rectangle(4,6)

   run.print_perimeter()
