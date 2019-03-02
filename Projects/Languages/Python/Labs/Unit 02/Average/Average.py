class Average:

   def __init__ (self, one,two):
      self.one = one
      self.two = two

   def calc_average(self):
      self.sum = self.one + self.two
      return self.sum / 2

   def print_result(self):
      print(str(self.one) + " and " + str(self.two) + " have an average of " + str(round(self.calc_average())))

class Runner():
   run = Average(100,200)

   run.calc_average()
   run.print_result()
