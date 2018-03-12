import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipmentTest {
    Equipment goods = null;
    @Before
    public void setup(){ goods = new Equipment("Haro",123,SportType.MOUNTAINBIKE);}


    @Test
    public void getWeightTest() {
        goods.setWeight(112);
        assertEquals(112,2,goods.getWeight());
    }

    @Test
    public void setWeightTest() {
        goods.setWeight(112);
        assertEquals(112,2,goods.getWeight());
    }

    @Test
    public void getProduceNameTest() {
        goods.setProduceName("Uvex");
        assertEquals("Uvex",goods.getProduceName());
    }

    @Test
    public void setProduceNameTest() {
        goods.setProduceName("Adidas");
        assertEquals("Adidas",goods.getProduceName());
    }

    @Test
    public void getSportTypeTest() {
        goods.setSportType(SportType.MOUNTAINBIKE);
        assertEquals(SportType.MOUNTAINBIKE,goods.getSportType());
    }

    @Test
    public void setSportTypeTest() {
        goods.setSportType(SportType.MOUNTAINBIKE);
        assertEquals(SportType.MOUNTAINBIKE,goods.getSportType());
    }

    @Test
    public void toStringTest() {
        assertNotNull(goods.getProduceName());
        assertNotNull(goods.getWeight());
        assertNotNull(goods.getSportType());

    }
}