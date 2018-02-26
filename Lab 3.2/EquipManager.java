import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EquipManager {
    private  List<Equipment> listEquipment;

    public EquipManager(List<Equipment> listEquipment) {
        this.listEquipment = listEquipment;
    }

    public void printList() {
        for(Equipment eq : listEquipment) {
            System.out.println(eq.toString());
        }
    }

    public  List<Equipment> sortByWeight( List<Equipment> list){
        list.sort(Comparator.comparingDouble(Equipment::getWeight));
        return list;
    }

    public  List<Equipment> findBySportType(String sportType){
        List<Equipment> result = new LinkedList<Equipment>();
        for(Equipment eq: listEquipment) {
            if(eq.getSportType().name().equalsIgnoreCase(sportType)) {
                result.add(eq);
            }
        }
        return sortByWeight(result);
    }
}

