package people.staff;

import people.Person;

public class CabinCrewMember extends Person {

    private Ranks rank;

    public CabinCrewMember(String name, Ranks rank) {
        super(name);
        this.rank = rank;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public String speakToPassengers(){
        return "We're definitely not going to crash, this is normal";
    }
}
