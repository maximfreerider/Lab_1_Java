from operator import attrgetter


class EquipmentManager:

    equipment_list = []

    def sort_by_weight(equipment_list):
        return sorted(equipment_list, key=attrgetter('weight'))

    def find_by_sport_type(equipment_list, sport_type):
        found_equipment_by_sport_type = []
        for equipment in equipment_list:
            if(equipment.type == sport_type):
                found_equipment_by_sport_type.append(equipment)

        return found_equipment_by_sport_type

    def print_list(equipment_list):
        for equipment in equipment_list:
            print(equipment.__str__())




# __init__(self):
#a = ('a' , 'b' , 'c','d')
#set = frozenset{a}


