import People.Pilot;

public class Plane {

    private PlaneType planeType;
    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public String flyPlane(Pilot pilot) {
        return pilot.getName() + " is flyity skyity";
    }
}
