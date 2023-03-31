import People.CabinCrew;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    
    CabinCrew cabinCrew;
    CabinCrew cabinCrew1;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Jack", Rank.FLIGHT_ATTENDANT);
        cabinCrew1 = new CabinCrew("Joan", Rank.FIRST_OFFICER);

    }

    @Test
    public void hasNameWeightAndRank(){
        assertEquals("Jack",cabinCrew.getName());
        assertEquals(50, cabinCrew.getWeight(),0.00);
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getRank());
    }

    @Test
    public void hasNameWeightAndRank1(){
        assertEquals("Joan",cabinCrew1.getName());
        assertEquals(50, cabinCrew1.getWeight(),0.00);
        assertEquals(Rank.FIRST_OFFICER, cabinCrew1.getRank());
    }
}
