class StarsAndStripes:


def __init__(self):
    print("StarsAndStripes")


def printTwentyStars(self):
    print("********************")


def printTwentyDashes(self):
    print("--------------------\n")


def printTwoBlankLines(self):
    print("\n\n")


def printASmallBox(self):
    self.printTwentyDashes()
    self.printTwentyStars()
    self.printTwentyDashes()
    self.printTwentyStars()
    self.printTwentyDashes()
    self.printTwentyStars()
    self.printTwentyDashes()


def printABigBox(self):
    self.printASmallBox()
    self.printASmallBox()


class Runner:

    # object instantiation
pattern = StarsAndStripes()

# pattern
pattern.printTwoBlankLines()
pattern.printASmallBox()
pattern.printTwoBlankLines()
pattern.printABigBox()
