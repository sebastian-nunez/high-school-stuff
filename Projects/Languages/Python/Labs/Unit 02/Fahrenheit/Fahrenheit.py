class Fahrenheit:
   def __init__(self, fahrenheit):
      self.fahrenheit = fahrenheit

   def get_celcius(self):
      return ((self.fahrenheit - 32) * 5) / 9

   def print_celcius(self):
      print(str(self.fahrenheit) + " degrees Fahrenheit == " + str(round(self.get_celcius())) + " degrees Celcius")

class Runner():
   run = Fahrenheit(98)

   run.print_celcius()
