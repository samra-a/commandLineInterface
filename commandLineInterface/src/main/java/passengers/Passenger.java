package passengers;

import java.util.UUID;

public class Passenger implements IPassenger {
    //Properties
    private String name;
    private int contactNumber;
    private String customerID = ID();

    public Passenger(String name, int contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        //this.customerID = ID();
    }

    public String ID(){
        UUID ID = UUID.randomUUID();
        String IDAsString = ID.toString();
        return "Your UUID is: " + IDAsString;

    }


    @Override
    public boolean hasPassengerBeenBookedOnFlight() {
            return false;
    }

    //Getters/Setters
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getContactNumber() {
        return this.contactNumber;
    }

    @Override
    public void setContactNumber(int number) {
        this.contactNumber = number;
    }

    @Override
    public String getCustomerID() {
        return this.customerID;
    }

    @Override
    public void setCustomerId(String id) {
        this.customerID = id;
    }
}


