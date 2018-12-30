class MPH:
    def __init__(self, dist, hrs, mins):
        self.dist = dist
        self.hrs = hrs
        self.mins = mins

    def calc_MPH(self):
        time = self.hrs + (self.mins / 60)
        return round(self.dist / time)

    def print_MPH(self):
        print("The speed is " + str(self.calc_MPH()) + " mph")


class Runner():
    run = MPH(120, 1, 30)

    run.print_MPH()
