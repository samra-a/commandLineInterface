package flights;

import passengers.Passenger;

import java.util.ArrayList;

public class Flight implements IFlight {
    //Properties
    private String destination;
    private int flightID;
    private ArrayList<Passenger> passengers= new ArrayList<Passenger>();

    //Getters/Setters

    @Override
    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    @Override
    public String getDestination() {
        return this.destination;
    }

    @Override
    public int getFlightID() {
        return this.flightID;
    }
}
