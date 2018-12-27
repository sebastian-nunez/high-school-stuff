import math


class Distance:
    def __init__(self, x1, y1, x2, y2):
        self.x1 = x1
        self.y1 = y1
        self.x2 = x2
        self.y2 = y2

    def calc_distance(self):
        return round(math.sqrt(math.pow(self.x2 - self.x1, 2) + math.pow(self.y2 - self.y1, 2)), 2)

    def print_distance(self):
        print("The distance is " + str(self.calc_distance()))


class Runner():
    run = Distance(4, 2, 8, 16)

    run.print_distance()
