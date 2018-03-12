import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeTest {
    Bike velosyped = null;
    @Before
    public void setup(){
        velosyped = new Bike("Haro", 122, SportType.MOUNTAINBIKE, 4, 2);
    }

    @Test
    public void getGearsNumberTest() {
        velosyped.setGearsNumber(12);
        assertEquals(12,velosyped.getGearsNumber());
    }

    @Test
    public void setGearsNumberTest() {
        velosyped.setGearsNumber(18);
        assertEquals(18,velosyped.getGearsNumber());
    }

    @Test
    public void getNumberOfBrakeTest() {
        velosyped.setNumberOfBrake(18);
        assertEquals(18,velosyped.getNumberOfBrake());
    }

    @Test
    public void setNumberOfBrakeTest() {
        velosyped.setNumberOfBrake(9);
        assertEquals(9,velosyped.getNumberOfBrake());
    }

    @Test
    public void toStringTest() {
        assertNotNull(velosyped.getGearsNumber());
        assertNotNull(velosyped.getNumberOfBrake());
    }
}