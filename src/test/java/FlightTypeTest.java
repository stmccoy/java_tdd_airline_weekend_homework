import Equiptment.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTypeTest {

    PlaneType flightType;

    @Before
    public void before(){
        flightType = PlaneType.BOEING747;
    }

    @Test
    public void canGetWeight(){
        assertEquals(500, flightType.getWeight());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, flightType.getCapacity());
    }
}
