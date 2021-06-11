import org.junit.Before;
import org.junit.Test;
import people.staff.Ranks;

import static org.junit.Assert.assertEquals;

public class RanksTest {

    Ranks rank;

    @Before
    public void before(){
        rank = Ranks.Captain;
    }

    @Test
    public void canGetValue(){
        assertEquals(1, rank.getValue());
    }
}
