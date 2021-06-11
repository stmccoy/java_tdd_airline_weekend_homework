import org.junit.Before;
import org.junit.Test;
import people.staff.Ranks;
import people.staff.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Emily", Ranks.Captain);
    }

    @Test
    public void canGetName(){
        assertEquals("Emily", pilot.getName());
    }

    @Test
    public void canSetName(){
        pilot.setName("Ethan");
        assertEquals("Ethan", pilot.getName());
    }

    @Test
    public void canGetRanK(){
        assertEquals(Ranks.Captain, pilot.getRank());
    }

    @Test
    public void canSetRank(){
        pilot.setRank(Ranks.FirstOfficer);
        assertEquals(Ranks.FirstOfficer, pilot.getRank());
    }

    @Test
    public void canGetLicenseNumber(){
        assertEquals(null, pilot.getPilotLicense());
    }

    @Test
    public void canSetLicenseNumber(){
        pilot.setPilotLicense("124444NCY");
        assertEquals("124444NCY", pilot.getPilotLicense());
    }

    @Test
    public void hasFlyingStatus(){
        assertEquals(false, pilot.getFlyingStatus());
    }

    @Test
    public void canFly(){
        pilot.flyPlane();
        assertEquals(true, pilot.getFlyingStatus());
    }

    @Test
    public void canLand(){
        pilot.flyPlane();
        pilot.landPlane();
        assertEquals(false, pilot.getFlyingStatus());
    }
}
