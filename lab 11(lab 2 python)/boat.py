from equipment import Equipment


class Boat(Equipment):

    def __init__(self,produce_name, weight, people_count,vesla,chairs,vest):
        super(Boat, self).__init__(produce_name, weight)
        self.people_count = people_count
        self.vesla = vesla
        self.chairs = chairs
        self.vest = vest

    def __str__(self):
        return super(Boat, self).__str__() + 'people_count = ' + str(self.people_count) \
               + 'vesla = ' + str(self.vesla) + 'chairs = ' + str(self.chairs) + 'vest = ' + str(self.vest)