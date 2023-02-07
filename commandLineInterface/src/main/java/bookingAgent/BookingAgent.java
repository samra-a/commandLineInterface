package bookingAgent;

import flights.Flight;
import passengers.Passenger;

import java.util.ArrayList;

public class BookingAgent {

    //Properties
    private ArrayList<Flight>flights;
    private String name;
    private String companyName;

    public BookingAgent(String name, String companyName) {
        this.flights = new ArrayList<Flight>();
        this.name = name;
        this.companyName = companyName;
    }


    public void addFlight(Flight flight) {
        flights.add(flight);

    }


    public ArrayList<Flight> displayAllFlights() {
        return this.flights;
    }


    public void cancelFlights() {

    }


    public void bookPassengerToFlight(Passenger passenger, int flightID) {
        //get passengers from Passenger ArrayList

        //add passengers  to Flight ArrayList
        //need to loop through all the flights
        //find the ones with the correct id
        //add passenegr to flight method
    }
}
