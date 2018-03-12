import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoatTest {
    Boat boat1 = null;

    @Before
    public void setup(){
        boat1 = new Boat("USA", 200, 5, SportType.KIAYKI,4, 2, 6);
    }

    @Test
    public void getPeopleCountTest() {
        boat1.setPeopleCount(5);
        assertEquals(5,boat1.getPeopleCount());
    }

    @Test
    public void setPeopleCountTest() {
        boat1.setPeopleCount(2);
        assertEquals(2,boat1.getPeopleCount());
    }

    @Test
    public void getVeslaTest() {
        boat1.setVesla(2);
        assertEquals(2,boat1.getVesla());
    }

    @Test
    public void setVeslaTest() {
        boat1.setVesla(6);
        assertEquals(6,boat1.getVesla());
    }

    @Test
    public void getChairsTest() {
        boat1.setChairs(10);
        assertEquals(10,boat1.getChairs());
    }

    @Test
    public void toStringTest() {
        assertNotNull(boat1.getPeopleCount());
        assertNotNull(boat1.getVesla());
        assertNotNull(boat1.getChairs());
        assertNotNull(boat1.getVest());
    }

    @Test
    public void setChairsTest() {
        boat1.setChairs(5);
        assertEquals(5,boat1.getChairs());
    }

    @Test
    public void getVestTest() {
        boat1.setVest(2);
        assertEquals(2,boat1.getVest());
    }

    @Test
    public void setVestTest() {
        boat1.setVest(8);
        assertEquals(8,boat1.getVest());
    }
}