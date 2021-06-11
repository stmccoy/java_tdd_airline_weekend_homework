import Equiptment.Plane;
import Equiptment.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING748);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING748, plane.getPlaneType());
    }

}
