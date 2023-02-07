package flights;

import passengers.Passenger;

import java.util.ArrayList;

public class Flight {
    //Properties
    private String destination;
    private int flightID;
    private ArrayList<Passenger> passengers= new ArrayList<Passenger>();

    public Flight(String destination, int flightID) {
        this.destination = destination;
        this.flightID = flightID;
    }

    //Getters/Setters

    // give all the passengers in the passenger arraylist a flight ID

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }


    public String getDestination() {
        return this.destination;
    }


    public int getFlightID() {
        return this.flightID;
    }
}
