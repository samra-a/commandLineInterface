package bookingAgent;

import flights.Flight;
import passengers.Passenger;

import java.util.ArrayList;

public interface IBookingAgent {
    public void newFlight();
    public ArrayList<Flight> displayAllFlights();
    void cancelFlights();
    void bookPassengerToFlight(Passenger passenger, Flight flight);
}
