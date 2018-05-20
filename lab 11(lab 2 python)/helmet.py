from equipment import Equipment


class Helmet(Equipment):

    def __init__(self, produce_name, weight,  size):
        super(Helmet, self).__init__(produce_name, weight)
        self.size = size

    def __str__(self):
        return super(Helmet, self).__str__() + 'size = ' + str(self.size)
