import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;



    @Before
    public void before(){
        passenger = new Passenger("Jon", 15);


    }

    @Test
    public void hasNameWeightAndBags(){
        assertEquals("Jon",passenger.getName());
        assertEquals(50, passenger.getWeight(),0.00);
        assertEquals(15, passenger.getBagWeight(),0.00);
    }


}
