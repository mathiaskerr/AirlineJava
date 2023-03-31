import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Joe","P100");

    }

    @Test
    public void hasNameWeightAndBags(){
        assertEquals("Joe",pilot.getName());
        assertEquals(50, pilot.getWeight(),0.00);
        assertEquals("P100", pilot.getLicence());

    }
}
