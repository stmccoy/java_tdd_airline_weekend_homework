package people.staff;

import Equiptment.Plane;
import people.customer.Passenger;

import java.util.ArrayList;

public class FlightManager extends CabinCrewMember{

    public FlightManager(String name, Ranks rank) {
        super(name, rank);
    }

    public int howMuchBaggageWeightForPassenger(Passenger passenger, int bagWeight){
        return passenger.getNumberOfBags() * bagWeight;
    }

    public int howMuchBaggageWeightHasBeenBooked(ArrayList<Passenger> passengers, int bagWeight){
        int totalBagWeight = 0;
        for (Passenger passenger : passengers){
            totalBagWeight += this.howMuchBaggageWeightForPassenger(passenger, bagWeight);
        }
        return totalBagWeight;
    }

    public int howMuchWeightIsLeftOnPlane(Plane plane, ArrayList<Passenger> passengers, int bagWeight){
        return plane.getPlaneType().getWeight() - this.howMuchBaggageWeightHasBeenBooked(passengers, bagWeight);
    }




}
