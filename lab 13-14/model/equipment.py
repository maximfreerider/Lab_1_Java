class Equipment:

    def __init__(self, produce_name, weight,type):
        self.produceName = produce_name
        self.weight = weight
        self.type = type

    def __str__(self):
        return 'Produce_name = ' + str(self.produceName) + ', weight = ' + str(self.weight) +\
               ', type = ' + str(self.type)