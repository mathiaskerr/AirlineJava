import People.CabinCrew;
import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Plane plane;
    CabinCrew crew1;
    CabinCrew crew2;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Flight flight;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        crew1 = new CabinCrew("Jim", Rank.FIRST_OFFICER);
        crew2 = new CabinCrew("Jil",Rank.CAPTAIN);
        pilot = new Pilot("Jannet","TS50");
        passenger1 = new Passenger("Jamie",10);
        passenger2 = new Passenger("Jolene",5);
        passenger3 = new Passenger("Jack",15);
        flight = new Flight(plane,"GL500","GLA","LHT","1800");
//        ArrayList<Passenger> passengersToBook = new ArrayList<>();
//        passengersToBook.add(passenger1);
//        passengersToBook.add(passenger2);
//        passengersToBook.add(passenger3);
    }

    @Test
    public void flightHasAllAttributes(){
        assertEquals(PlaneType.BOEING747,flight.getPlane().getPlaneType());
        assertEquals("GL500",flight.getFlightNo());
        assertEquals("GLA",flight.getDestination());
        assertEquals("LHT",flight.getDepartureAirport());
        assertEquals("1800",flight.getDepartureTime());
    }
    @Test
    public void returnAvailableSeats(){
        assertEquals(10,flight.getAvailableSeats());
    }
    @Test
    public void canBookPassengers(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(3,flight.getBookedPassengers().size());
    }


}
