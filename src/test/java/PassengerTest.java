import people.customer.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Steve");
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Steve", passenger.getName());
    }

    @Test
    public void canSetPassengerName(){
        passenger.setName("Sarah");
        assertEquals("Sarah", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(0, passenger.getNumberOfBags());
    };

    @Test
    public void canSetNumberOfBags(){
        passenger.setNumberOfBags(2);
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canSetFlight(){
        passenger.setFlight("AH12");
        assertEquals("AH12", passenger.getFlight());
    }

    @Test
    public void canSetSeatNumber(){
        passenger.setSeatNumber(12);
        assertEquals(12, passenger.getSeatNumber());
    }
}
