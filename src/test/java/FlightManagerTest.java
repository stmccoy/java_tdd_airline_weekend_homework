import Equiptment.Plane;
import Equiptment.PlaneType;
import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import people.customer.Passenger;
import people.staff.FlightManager;
import people.staff.Ranks;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;

    @Before
    public void before(){
        flightManager = new FlightManager("Colin", Ranks.FirstOfficer);
    }

    @Test
    public void flightManagerHasName(){
        assertEquals("Colin", flightManager.getName());
    }

    @Test
    public void setFlightManagerHasRank(){
        assertEquals(Ranks.FirstOfficer, flightManager.getRank());
    }

    @Test
    public void FlightManagerCanCheckWeightOfPassengerBags(){
        Passenger passenger = new Passenger("Clive");
        passenger.setNumberOfBags(3);
        assertEquals(15, flightManager.howMuchBaggageWeightForPassenger(passenger, 5));
    }

    @Test
    public void FlightManagerCanCheckWeightOfAllPassengersBags(){
        Passenger passenger = new Passenger("Clive");
        passenger.setNumberOfBags(3);
        Passenger passengerTwo = new Passenger("Fred");
        passengerTwo.setNumberOfBags(5);
        Passenger passengerThree = new Passenger("Hannah");
        passengerThree.setNumberOfBags(2);
        Flight flight = new Flight();
        Plane plane = new Plane(PlaneType.BOEING749);
        flight.setPlane(plane);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passengerTwo);
        flight.bookPassenger(passengerThree);
        assertEquals(50, flightManager.howMuchBaggageWeightHasBeenBooked(flight.getPassengers(), 5));
    }

    @Test
    public void FlightManagerCanCheckHowMuchWeightIsLeftAvailableOnePlane(){
        Passenger passenger = new Passenger("Clive");
        passenger.setNumberOfBags(3);
        Passenger passengerTwo = new Passenger("Fred");
        passengerTwo.setNumberOfBags(5);
        Passenger passengerThree = new Passenger("Hannah");
        passengerThree.setNumberOfBags(2);
        Flight flight = new Flight();
        Plane plane = new Plane(PlaneType.BOEING749);
        flight.setPlane(plane);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passengerTwo);
        flight.bookPassenger(passengerThree);
        assertEquals(   1950, flightManager.howMuchWeightIsLeftOnPlane(flight.getPlane(), flight.getPassengers(), 5));
    }
}
