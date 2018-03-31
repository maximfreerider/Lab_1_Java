import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EquipManager {
    private  List<Equipment> listEquipment;

    public EquipManager(List<Equipment> listEquipment) {
        this.listEquipment = listEquipment;
    }

    public  List<Equipment> sortByWeight( List<Equipment> list){
        list.sort(Comparator.comparingDouble(Equipment::getWeight));
        return list;
    }

    public  List<Equipment> findBySportType(List<Equipment> equipments , SportType sportType){
        List<Equipment> result = new LinkedList<Equipment>();
        for(Equipment eq: equipments) {
            if(eq.getSportType().equals(sportType)) {
                result.add(eq);
            }
        }
        return result;
    }

    public void printList() {
        for(Equipment eq : listEquipment) {
            System.out.println(eq.toString());
        }
    }
}