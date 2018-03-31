import org.junit.Before;
import org.junit.Test;

import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EquipManagerTest {

    EquipManager manager = null;
    List<Equipment> listEquipment = null;


    @Before
    public void setup() {
        listEquipment = new ArrayList<Equipment>();
        listEquipment.add(new Bike("Haro", 122, SportType.MOUNTAINBIKE, 4, 2));
        listEquipment.add(new Boat("USA", 200, 5, SportType.KIAYKI,4, 2, 6));
        listEquipment.add(new Helmet("Uvex", 10, SportType.MOUNTAINBIKE, 2));
        manager = new EquipManager(listEquipment);
    }

    @Test
    public void printListTest() {
    }

    @Test
    public void sortByWeightTest() {
        manager.sortByWeight(listEquipment);
        double weightByPrevious = 0;
        for (Equipment equipment : listEquipment) {
            assertTrue((equipment.getWeight() > weightByPrevious));
        }
    }

    @Test
    public void findBySportTypeTest(){
       List<Equipment> result = manager.findBySportType(listEquipment,SportType.MOUNTAINBIKE);
       //дізнвтися про foreach
        for (Equipment equipment : result) {
            assertEquals(SportType.MOUNTAINBIKE, equipment.getSportType());
        }
    }
}
