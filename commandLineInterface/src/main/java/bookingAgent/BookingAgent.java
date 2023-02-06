package bookingAgent;

import flights.Flight;
import passengers.Passenger;

import java.util.ArrayList;

public class BookingAgent implements IBookingAgent {
    private ArrayList<Flight>flight = new ArrayList<Flight>();

    @Override
    public void newFlight() {

    }

    @Override
    public ArrayList<Flight> displayAllFlights() {
        return this.flight;
    }

    @Override
    public void cancelFlights() {

    }

    @Override
    public void bookPassengerToFlight(Passenger passenger, Flight flight) {

    }
}
