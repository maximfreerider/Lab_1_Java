from equipment import Equipment

class Bike(Equipment):

    def __init__(self, produce_name, weight, producer, gear_numbers, number_of_brake):
        super(Bike, self).__init__(produce_name, weight)
        self.producer = producer
        self.gear_numbers = gear_numbers
        self.number_of_brake = number_of_brake

    def __str__(self):
        return super(Bike, self).__str__() + 'producer = ' + str(self.producer) + 'gear_numbers = ' + str(self.number_of_brake)


