package people.staff;

public enum Ranks {


    Captain(1),
    FirstOfficer(2),
    Purser(3),
    FlightAttendant(4);

    private final int value;

    Ranks(int value){

        this.value = value;

    }

    public int getValue() {
        return this.value;
    }
}
