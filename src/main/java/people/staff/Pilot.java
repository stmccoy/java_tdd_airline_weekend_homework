package people.staff;

public class Pilot extends CabinCrewMember{

    private String pilotLicense;
    private boolean flyingPlane;

    public Pilot(String name, Ranks rank) {
        super(name, rank);
        this.pilotLicense = null;
        this.flyingPlane = false;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }

    public void setPilotLicense(String pilotLicense) {
        this.pilotLicense = pilotLicense;
    }

    public boolean getFlyingStatus() {
        return flyingPlane;
    }

    public void flyPlane(){
        this.flyingPlane = true;
    }

    public void landPlane(){
        this.flyingPlane = false;
    }
}
