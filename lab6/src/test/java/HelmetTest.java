import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelmetTest {
    Helmet helmet1 = null;

    @Before
    public void setup(){
        helmet1 = new Helmet("Uvex",2,SportType.KIAYKI,25);
    }

    @Test
    public void getSizeTest() {
        assertEquals(25,helmet1.getSize());
    }

    @Test
    public void setSizeTest() {
        helmet1.setSize(2);
        assertEquals(2,helmet1.getSize());
    }

    @Test
    public void toStringTest() {
        assertNotNull(helmet1.getSize());
    }

}