class LineSlope:
    def __init__(self, x1, y1, x2, y2):
        self.x1 = x1
        self.y1 = y1
        self.x2 = x2
        self.y2 = y2

    def calc_slope(self):
        return (self.y2 - self.y1) / (self.x2 - self.x1)

    def print_slope(self):
        print("The slope is " + str(round(self.calc_slope(), 2)))


class Runner():
    run = LineSlope(4, 2, 6, 9)

    run.calc_slope()
    run.print_slope()
