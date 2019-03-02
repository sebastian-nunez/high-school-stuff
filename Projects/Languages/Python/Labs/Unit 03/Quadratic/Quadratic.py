import math

class Quadratic:
   def __init__(self,a,b,c):
      self.a = a
      self.b = b
      self.c = c

   def calc_roots(self):
      discriminat = math.pow(self.b,2) - (4 * self.a * self.c)

      if discriminat > -1:
         root1 = round((-self.b + math.sqrt(discriminat)) / (2 * self.a),2)
         root2 = round((-self.b - math.sqrt(discriminat)) / (2 * self.a),2)
         roots = {'root1': root1, 'root2': root2}
      else:
         roots = {'root1': 'N.R.S.', 'root2': 'N.R.S.'}

      return roots

   def print_roots(self):
      print("The roots are " + str(self.calc_roots()['root1']) + " and " + str(self.calc_roots()['root2']))

class Runner():
   run = Quadratic(1,5,6)

   run.print_roots()
