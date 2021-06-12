package people.customer;

import people.Person;

public class Passenger extends Person{

    private int numberOfBags;
    private String flight;
    private int seatNumber;

    public Passenger(String name){
       super(name);
       this.numberOfBags = 0;
       this.flight = null;
       this.seatNumber = 0;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
