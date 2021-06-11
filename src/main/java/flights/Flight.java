package flights;

import Equiptment.Plane;
import people.customer.Passenger;
import people.staff.CabinCrewMember;
import people.staff.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(){
        this.pilot = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = null;
        this.flightNumber = null;
        this.destination = null;
        this.departureAirport = null;
        this.departureTime = null;
    }

    public ArrayList<Pilot> getPilot() {
        return pilot;
    }

    public void setPilot(ArrayList<Pilot> pilot) {
        this.pilot = pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int numberOfSeats(){
        return this.plane.getPlaneType().getCapacity();
    }

    public void bookPassenger(Passenger passenger){
        if(this.numberOfSeats() != this.getNumberOfPassengers()){
            this.passengers.add(passenger);
        }
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

}
