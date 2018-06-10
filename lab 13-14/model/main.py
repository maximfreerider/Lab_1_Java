from equipment_manager import EquipmentManager
from bike import Bike
from helmet import Helmet
from boat import Boat
from sport_type import SportType

if __name__ == '__main__':
    my_equipment_manager = EquipmentManager


    my_equipment_manager.equipment_list.append(Bike("Haro", 122, "USA", 4, 2, SportType.MOUNTAINBIKE))
    my_equipment_manager.equipment_list.append(Bike("Bergamount", 128, "Germany", 18, 2, SportType.MOUNTAINBIKE))
    my_equipment_manager.equipment_list.append(Boat("USA", 200, 5, 4, 2, 6, SportType.KIAYKI))
    my_equipment_manager.equipment_list.append(Helmet("Uvex", 10, 25, SportType.MOUNTAINBIKE))
    my_equipment_manager.equipment_list.append(Helmet("Abus",  2, 25, SportType.KIAYKI))

    my_equipment_manager.equipment_list = my_equipment_manager.find_by_sport_type\
        (my_equipment_manager.equipment_list, SportType.MOUNTAINBIKE)
    for equipment in my_equipment_manager.equipment_list:
        print(equipment.__str__())

    print('\n')

    my_equipment_manager.equipment_list = my_equipment_manager.sort_by_weight(my_equipment_manager.equipment_list)
    for equipment in my_equipment_manager.equipment_list:
        print(equipment.weight)