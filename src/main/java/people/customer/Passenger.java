package people.customer;

import people.Person;

public class Passenger extends Person{

    private int numberOfBags;

    public Passenger(String name){
       super(name);
       this.numberOfBags = 0;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
