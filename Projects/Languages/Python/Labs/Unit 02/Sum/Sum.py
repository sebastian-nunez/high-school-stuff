class Sum:
   def __init__(self,num1,num2):
      self.num1 = num1
      self.num2 = num2

   def calc_sum(self):
      return self.num1 + self.num2

   def print_sum(self):
      print("The sum is " + str(round(self.calc_sum(),2)))

class Runner():
   run = Sum(2,4)

   run.print_sum()
