import Equiptment.Plane;
import Equiptment.PlaneType;
import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import people.customer.Passenger;
import people.staff.CabinCrewMember;
import people.staff.Pilot;
import people.staff.Ranks;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FlightTest {

    private Flight flight;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    @Before
    public void before(){
        flight = new Flight();
        pilots = new ArrayList<>();
        cabinCrewMembers = new ArrayList<>();
        passengers = new ArrayList<>();
        plane = new Plane(PlaneType.BOEING749);
        flightNumber = "137SQT";
        destination = "Stockport";
        departureAirport = "LAX";
        departureTime = "17:00";
    }

    @Test
    public void canSetPilot(){
        Pilot pilotOne = new Pilot("Fred", Ranks.Captain);
        Pilot pilotTwo = new Pilot("Mary", Ranks.FirstOfficer);
        pilots.add(pilotOne);
        pilots.add(pilotTwo);
        flight.setPilot(pilots);
        assertEquals(pilots, flight.getPilot());
    }

    @Test
    public void canSetCabinCrewMembers() {
        CabinCrewMember cabinCrewMemberOne = new CabinCrewMember("Fiona", Ranks.FlightAttendant);
        CabinCrewMember cabinCrewMemberTwo = new CabinCrewMember("Ben", Ranks.FlightAttendant);
        cabinCrewMembers.add(cabinCrewMemberOne);
        cabinCrewMembers.add(cabinCrewMemberTwo);
        flight.setCabinCrewMembers(cabinCrewMembers);
        assertEquals(cabinCrewMembers, flight.getCabinCrewMembers());
    }

    @Test
    public void canSetPlane(){
        flight.setPlane(plane);
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canSetPlaneNumber(){
        flight.setFlightNumber(flightNumber);
        assertEquals(flightNumber, flight.getFlightNumber());
    }

    @Test
    public void canSetDestination(){
        flight.setDestination(destination);
        assertEquals(destination, flight.getDestination());
    }

    @Test
    public void canSetDepartureAirport(){
        flight.setDepartureAirport(departureAirport);
        assertEquals(departureAirport, flight.getDepartureAirport());
    }

    @Test
    public void canSetDepartureTime(){
        flight.setDepartureTime(departureTime);
        assertEquals(departureTime, flight.getDepartureTime());
    }

    @Test
    public void canGetNumberOfSeats(){
        flight.setPlane(plane);
        assertEquals(300, flight.numberOfSeats());
    }

    @Test
    public void canGetNumberOfPassengers(){
        Passenger passengerOne = new Passenger("Bobby");
        flight.setPlane(plane);
        flight.bookPassenger(passengerOne);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void canBookPassengerOntoPlane(){
        Passenger passengerOne = new Passenger("Bobby");
        Passenger passengerTwo = new Passenger("Clive");
        flight.setPlane(plane);
        flight.bookPassenger(passengerOne);
        flight.bookPassenger(passengerTwo);
        assertEquals(2, flight.getNumberOfPassengers());
    }

    @Test
    public void bookedPassengersHaveAFlight(){
        Passenger passengerOne = new Passenger("Bobby");
        flight.setPlane(plane);
        flight.setFlightNumber("A122");
        flight.bookPassenger(passengerOne);
        assertEquals("A122", passengerOne.getFlight());
    }

    @Test
    public void bookedPassengerHasSeat(){
        Passenger passengerOne = new Passenger("Bobby");
        flight.setPlane(plane);
        flight.setFlightNumber("A122");
        flight.bookPassenger(passengerOne);
        assertNotEquals(0, passengerOne.getSeatNumber());
    }

    @Test
    public void bookedPassengersHaveDifferentSeats(){
        Passenger passengerOne = new Passenger("Bobby");
        Passenger passengerTwo = new Passenger("Clive");
        flight.setPlane(plane);
        flight.setFlightNumber("A122");
        flight.bookPassenger(passengerOne);
        flight.bookPassenger(passengerTwo);
        assertNotEquals(passengerTwo.getSeatNumber(), passengerOne.getSeatNumber());
    }

}
