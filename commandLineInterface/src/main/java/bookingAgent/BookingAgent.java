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


    public void cancelFlight(Flight flight) {
            this.flights.remove(flight);
    }




    public void bookPassengerToFlight(Passenger passenger, int flightID) {

        //need to loop through all the flights
        int n = flights.size();
        for (int i = 0; i < n; i++){
            if(flights.get(i).getFlightID() == flightID){
                flights.get(i).addPassenger(passenger);

                System.out.println("Passenger has been booked on flight");
            }
        }
    }
}
