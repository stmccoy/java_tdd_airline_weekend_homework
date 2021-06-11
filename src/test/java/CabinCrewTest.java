import org.junit.Before;
import org.junit.Test;
import people.staff.Ranks;
import people.staff.CabinCrewMember;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Ben", Ranks.FlightAttendant);
    }

    @Test
    public void canGetName(){
        assertEquals("Ben", cabinCrewMember.getName());
    }

    @Test
    public void canSetName(){
        cabinCrewMember.setName("Bella");
        assertEquals("Bella", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Ranks.FlightAttendant, cabinCrewMember.getRank());
    }

    @Test
    public void canSetRank(){
        cabinCrewMember.setRank(Ranks.FirstOfficer);
        assertEquals(Ranks.FirstOfficer, cabinCrewMember.getRank());
    }

    @Test
    public void canSpeakToPassengers(){
        assertEquals("We're definitely not going to crash, this is normal", cabinCrewMember.speakToPassengers());
    }

}
