import People.CabinCrew;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private ArrayList<CabinCrew> crew;
    private ArrayList<Pilot> pilot;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;


   public Flight (Plane plane, String flightNo, String destination, String departureAirport, String departureTime){
       this.bookedPassengers = new ArrayList<>();
       this.crew = new ArrayList<>();
       this.pilot = new ArrayList<>();
       this.plane = plane;
       this.flightNo = flightNo;
       this.destination = destination;
       this.departureAirport = departureAirport;
       this.departureTime = departureTime;




   }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public ArrayList<CabinCrew> getCrew() {
        return crew;
    }

    public ArrayList<Pilot> getPilot() {
        return pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
