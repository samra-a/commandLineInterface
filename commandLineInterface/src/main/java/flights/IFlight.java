package flights;

import passengers.Passenger;

import java.util.ArrayList;

public interface IFlight {
    public ArrayList<Passenger> getPassengers();
    //ArrayList<Passenger> getPassengers;
    public String getDestination();
    public int getFlightID();

}
