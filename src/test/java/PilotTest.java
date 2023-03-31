import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    Plane plane;

    @Before
    public void before(){
        pilot = new Pilot("Joe","P100");
        plane = new Plane(PlaneType.BOEING747);

    }

    @Test
    public void hasNameWeightRankAndLicence(){
        assertEquals("Joe",pilot.getName());
        assertEquals(50, pilot.getWeight(),0.00);
        assertEquals("P100", pilot.getLicence());
        assertEquals(Rank.PILOT, pilot.getRank());
    }
    @Test
    public void pilotFlyPlane(){
        assertEquals("Joe is flyity skyity", plane.flyPlane(pilot));
    }
}
