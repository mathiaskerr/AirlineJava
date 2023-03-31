import People.CabinCrew;
import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;

public class FlightTest {
    Plane plane;
    CabinCrew crew1;
    CabinCrew crew2;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        crew1 = new CabinCrew("Jim", Rank.FIRST_OFFICER);
        crew2 = new CabinCrew("Jil",Rank.CAPTAIN);
        pilot = new Pilot("Jannet","TS50");
        passenger1 = new Passenger("Jamie",10);
        passenger2 = new Passenger("Jolene",5);
        passenger3 = new Passenger("Jack",15);
    }
}
