class Bike:
    number_of_brake= 0

    def __init__(self, produce_name, weight, producer, gear_numbers, number_of_brake):
        self.produce_name = produce_name
        self.weight = weight
        self.producer = producer
        self.gear_numbers = gear_numbers
        self.number_of_brake = number_of_brake


    def toString(self):
        print('produce name = ' + str(self.produce_name) + ' , ' + 'weight = ' + str(self.weight) + ' , ' + 'producer = ' + str(self.producer) + ' , '+ 'gear_numbers = ' + str(self.number_of_brake))


    def printSum(self):
        print("total_number_of_brake = ", Bike.number_of_brake)

    @staticmethod
    def printStaticSum():
        print("total_number_of_brake = ", Bike.number_of_brake)


if __name__ == '__main__':
    mountain_bike = Bike("Cube", 155, " German ", 26, 2)
    dawn_hill_bike = Bike("Trek", 12.5, " USA ", 8, 2)
    cross_country_bike = Bike("Author", 9.5, " USA ", 30,2)

    mountain_bike.toString()
    mountain_bike.printSum()

    dawn_hill_bike.toString()
    dawn_hill_bike.printSum()

    cross_country_bike.toString()
    cross_country_bike.printSum()

    Bike.printStaticSum()
